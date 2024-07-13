package Database;

import java.sql.*;
import java.util.Vector;
import javafx.application.Platform;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import org.apache.derby.jdbc.ClientDriver;

public class DAL_1 {

    private static final String DB_URL = "jdbc:derby://localhost:1527/TicTacToe";
    private static final String DB_USER = "tic";
    private static final String DB_PASSWORD = "tic";

    static {
        try {
            DriverManager.registerDriver(new ClientDriver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

    public static Vector<UserTable> getAllData() throws SQLException {
        Vector<UserTable> userList = new Vector<>();
        String query = "SELECT * FROM USERTABLE";

        try (Connection con = getConnection();
             Statement stm = con.createStatement();
             ResultSet rs = stm.executeQuery(query)) {

            while (rs.next()) {
                String userName = rs.getString("USERNAME");
                String password = rs.getString("PASSWORD");
                String email = rs.getString("EMAIL");
                String score = rs.getString("SCORE");
                boolean status = rs.getBoolean("STATUS");

                UserTable user = new UserTable(userName, password, email, score, status);
                userList.add(user);
            }
        } catch (SQLException e) {
            showAlert("Database Error", "Error fetching data: " + e.getMessage(), "OK");
            throw e;
        }
        return userList;
    }

    public static void update(UserTable user) throws SQLException {
        String sql = "UPDATE USERTABLE SET PASSWORD=?, EMAIL=?, SCORE=?, STATUS=? WHERE USERNAME=?";

        try (Connection con = getConnection();
             PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, user.getPassword());
            stm.setString(2, user.getEmail());
            stm.setString(3, user.getScore());
            stm.setBoolean(4, user.isStatus());
            stm.setString(5, user.getUserName());

            stm.executeUpdate();
        } catch (SQLException e) {
            showAlert("Database Error", "Error updating data: " + e.getMessage(), "OK");
            throw e;
        }
    }

    public static boolean isRepeated(String userName) throws SQLException {
        String query = "SELECT COUNT(*) FROM USERTABLE WHERE USERNAME = ?";
        
        try (Connection con = getConnection();
             PreparedStatement pstmt = con.prepareStatement(query)) {
            pstmt.setString(1, userName);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    int count = rs.getInt(1);
                    return count > 0;
                }
            }
        } catch (SQLException e) {
            showAlert("Database Error", "Error checking username: " + e.getMessage(), "OK");
            throw e;
        }
        return false;
    }

    public static void insert(UserTable user) throws SQLException {
        String query = "INSERT INTO USERTABLE (USERNAME, PASSWORD, EMAIL, SCORE, STATUS) VALUES (?, ?, ?, ?, ?)";

        try (Connection con = getConnection();
             PreparedStatement pstmt = con.prepareStatement(query)) {
            pstmt.setString(1, user.getUserName());
            pstmt.setString(2, user.getPassword());
            pstmt.setString(3, user.getEmail());
            pstmt.setString(4, user.getScore());
            pstmt.setBoolean(5, user.isStatus());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            showAlert("Database Error", "Error inserting data: " + e.getMessage(), "OK");
            throw e;
        }
    }

    private static void showAlert(String title, String header, String buttonName) {
        Platform.runLater(() -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle(title);
            alert.setHeaderText(header);
            ButtonType changeName = new ButtonType(buttonName);
            alert.getButtonTypes().setAll(changeName);
            alert.showAndWait();
        });
    }
}

package tictactoe;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javax.swing.JOptionPane;
import org.apache.derby.jdbc.ClientDriver;




public class DAL_1 {

    public static Vector<UserTable> getAllData() throws SQLException {
        DriverManager.registerDriver(new ClientDriver());
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Tic", "tic", "tic");
        Statement stm = con.createStatement();
        String query = "SELECT * FROM USERTABLE";
        ResultSet rs = stm.executeQuery(query);
        Vector<UserTable> userList = new Vector<>();

        while (rs.next()) {
            String userName = rs.getString(1);
            String email = rs.getString(2);
            String password = rs.getString(3);
            String score = rs.getString(4);
            boolean status = rs.getBoolean(5);

            UserTable user = new UserTable(userName, password, email, score, status);
            userList.add(user);
        }
        rs.close();
        stm.close();
        con.close();
        return userList;
    }

    public static void update(UserTable user) throws SQLException {
        String sql = "UPDATE USERTABLE SET PASSOWARD=?, EMAIL=?, SCORE=?, STATUS=? WHERE USERNAME=?";
        try (Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Tic", "tic", "tic");
             PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, user.getPassword());
            stm.setString(2, user.getEmail());
            stm.setString(3, user.getScore());
            stm.setBoolean(4, user.isStatus());
            stm.setString(5, user.getUserName());

            stm.executeUpdate();
        }
    }

    public static void insert(UserTable user) throws SQLException {
        DriverManager.registerDriver(new ClientDriver());
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Tic", "tic", "tic");
        String query = "INSERT INTO USERTABLE (USERNAME, PASSOWARD, EMAIL, SCORE, STATUS) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement pstmt = con.prepareStatement(query);

        pstmt.setString(1, user.getUserName());
        pstmt.setString(2, user.getPassword());
        pstmt.setString(3, user.getEmail());
        pstmt.setString(4, user.getScore());
        pstmt.setBoolean(5, user.isStatus());
        pstmt.executeUpdate();
        isRepeated();
        pstmt.close();
        con.close();
    }

    public static UserTable search(String username) throws SQLException {
        DriverManager.registerDriver(new ClientDriver());
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Tic", "tic", "tic");
        String query = "SELECT USERTABLE, PASSOWARD, EMAIL, SCORE, STATUS FROM UserTable WHERE USERNAME = ?";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setString(1, username);

        ResultSet rs = pstmt.executeQuery();
        UserTable user = null;
        if (rs.next()) {
            String userName = rs.getString(1);
            String password = rs.getString(2);
            String email = rs.getString(3);
            String score = rs.getString(4);
            boolean status = rs.getBoolean(5);
            user = new UserTable(userName, password, email, score, status);
        }
        rs.close();
        pstmt.close();
        con.close();
        return user;
    }

    public static Vector<UserTable> isRepeated() throws SQLException {
        DriverManager.registerDriver(new ClientDriver());
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Tic", "tic", "tic");
        Statement stm = con.createStatement();
        String query = "SELECT * FROM USERTABLE";
        ResultSet rs = stm.executeQuery(query);

        Vector<UserTable> userList = new Vector<>();

        while (rs.next()) {
            String userName = rs.getString(1);
            String email = rs.getString(2);
            String password = rs.getString(3);
            String score = rs.getString(4);
            boolean status = rs.getBoolean(5);

            UserTable user = new UserTable(userName, password, email, score, status);

            if (userList.stream().anyMatch(existingUser -> existingUser.getUserName().equals(userName))) {
                showAlert("Repeated User Name", "Duplicate user found", "Change");
            } else {
                userList.add(user);
            }
        }
        rs.close();
        stm.close();
        con.close();
        return userList;
    }
    
    
    public static boolean isPlayerExist(String userName ,String password) throws SQLException     
    {        
    boolean flag =false;

        DriverManager.registerDriver(new ClientDriver());
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Tic", "tic", "tic");
        PreparedStatement pstms = con.prepareStatement("SELECT USERNAME, PASSOWARD FROM USERTABLE WHERE USERNAME = ? AND PASSOWARD = ?");
        
         pstms.setString(1, userName);
        pstms.setString(2, password);
        
        ResultSet rs = pstms.executeQuery();
        
        while (rs.next()) {
        String name = rs.getString(1);
        String pass =  rs.getString(2);

           if ((userName.equals(name)) && (password.equals(pass))) {
              flag = true;
               break;
           }
           
         
    }
        rs.close();
         pstms.close();
        con.close();
       return flag; 
    }
    
     public static void updateStatus(String userName) throws SQLException {
        String sql = "UPDATE USERTABLE SET  STATUS=? WHERE USERNAME=?";
        try (Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Tic", "tic", "tic");
             PreparedStatement stm = con.prepareStatement(sql)) {     
            stm.setBoolean(1, true);
             stm.setString(2,userName);
            stm.executeUpdate();
            stm.close();
            con.close();
        }
    }
    

    private static void showAlert(String body, String header, String buttonName) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(body);
        alert.setHeaderText(header);
        ButtonType changeName = new ButtonType(buttonName);
        alert.getButtonTypes().setAll(changeName);
        alert.showAndWait();
    }
}

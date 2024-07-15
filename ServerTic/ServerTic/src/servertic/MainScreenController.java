package servertic;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class MainScreenController {

    @FXML
    private void openGraphScreen() {
        try {
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("GraphScreen.fxml"));
            stage.setTitle("Graph Screen");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void openCtrlServerScreen() {
        try {
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("CtrlServerScreen.fxml"));
            stage.setTitle("Control Server Screen");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

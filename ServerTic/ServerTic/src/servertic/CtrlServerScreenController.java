package servertic;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class CtrlServerScreenController {
    @FXML
    private Button startServerButton;
    @FXML
    private Button stopServerButton;

    private Server server;

    @FXML
    private void initialize() {
        server = new Server();

        startServerButton.setOnAction(event -> server.start());
        stopServerButton.setOnAction(event -> server.stop());
    }
}

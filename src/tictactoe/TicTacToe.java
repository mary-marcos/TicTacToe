
package tictactoe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToe extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        Font.loadFont(getClass().getResource("/fonts/MooLahLah-Regular.ttf").toExternalForm(), 10);
        
        SignInScr root = new SignInScr(stage);
        root.setId("backG");
        Scene scene = new Scene(root,750,570);
        scene.getStylesheets().add(getClass()
                .getResource("/style/CSS_StyleSheet.css").toExternalForm());
        Image icon = new Image(getClass().getResourceAsStream("/images/logo.png"));
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.setTitle("TicTacToe");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}

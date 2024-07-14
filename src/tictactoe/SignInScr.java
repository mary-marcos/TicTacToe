package tictactoe;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class SignInScr extends BorderPane {

    protected final AnchorPane anchorPane;
    protected final ImageView imageView;
    protected final Label label;
    protected final AnchorPane anchorPane0;
    protected final TextField textField;
    protected final ImageView imageView0;
    protected final Label label0;
    protected final ImageView imageView1;
    protected final TextField textField0;
    protected final Button button;
    protected final Label label1;
    protected final Label label2;
    protected final Label label3;
    protected final Label label4;
    
    private SignUpScr signUpSrc;
    private ChooseModeScr chooseModeSrc;
    private Stage stage;
    private Scene scene;
    boolean isGuest;

    public SignInScr(Stage _stage) {

        anchorPane = new AnchorPane();
        imageView = new ImageView();
        label = new Label();
        anchorPane0 = new AnchorPane();
        textField = new TextField();
        imageView0 = new ImageView();
        label0 = new Label();
        imageView1 = new ImageView();
        textField0 = new TextField();
        button = new Button();
        label1 = new Label();
        label2 = new Label();
        label3 = new Label();
        label4 = new Label();

        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(600.0);
        setPrefWidth(750.0);

        anchorPane.setMaxHeight(USE_PREF_SIZE);
        anchorPane.setMaxWidth(USE_PREF_SIZE);
        anchorPane.setMinHeight(USE_PREF_SIZE);
        anchorPane.setMinWidth(USE_PREF_SIZE);
        anchorPane.setPrefHeight(600.0);
        anchorPane.setPrefWidth(750.0);

        imageView.setFitHeight(165.0);
        imageView.setFitWidth(206.0);
        imageView.setLayoutX(448.0);
        imageView.setLayoutY(112.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("/images/logo.png").toExternalForm()));

        label.setId("ticTacToe");
        label.setLayoutX(384.0);
        label.setLayoutY(300.0);
        label.setText("Tic Tac Toe");
        label.setFont(new Font(70.0));
        BorderPane.setMargin(anchorPane, new Insets(0.0, 350.0, 0.0, 0.0));
        label.setTextFill(new LinearGradient(
            0, 0, 1, 0, true,  
            javafx.scene.paint.CycleMethod.NO_CYCLE,  
            new Stop(0, Color.rgb(255, 194, 1)),  
            new Stop(1, Color.rgb(215, 41, 120))
        ));
        setCenter(anchorPane);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setPrefHeight(453.0);
        anchorPane0.setPrefWidth(323.0);
        anchorPane0.setStyle("-fx-background-color: E1C15C; -fx-background-radius: 40;");

        textField.setAlignment(javafx.geometry.Pos.CENTER);
        textField.setLayoutX(86.0);
        textField.setLayoutY(91.0);
        textField.setPrefHeight(38.0);
        textField.setPrefWidth(217.0);
        textField.setPromptText("User Name");
        textField.setStyle("-fx-background-radius: 40;");

        imageView0.setFitHeight(61.0);
        imageView0.setFitWidth(60.0);
        imageView0.setLayoutX(14.0);
        imageView0.setLayoutY(80.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("/images/boy_145865.png").toExternalForm()));

        label0.setLayoutX(112.0);
        label0.setLayoutY(14.0);
        label0.setText("Sign In");
        label0.setTextFill(javafx.scene.paint.Color.WHITE);
        label0.setFont(new Font(38.0));

        imageView1.setFitHeight(55.0);
        imageView1.setFitWidth(60.0);
        imageView1.setLayoutX(17.0);
        imageView1.setLayoutY(176.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("/images/padlock_301677.png").toExternalForm()));

        textField0.setAlignment(javafx.geometry.Pos.CENTER);
        textField0.setLayoutX(86.0);
        textField0.setLayoutY(185.0);
        textField0.setPrefHeight(38.0);
        textField0.setPrefWidth(217.0);
        textField0.setPromptText("Password");
        textField0.setStyle("-fx-background-radius: 40;");

        button.setLayoutX(115.0);
        button.setLayoutY(275.0);
        button.setMnemonicParsing(false);
        button.setOnAction(this::signIn);
        button.setStyle("-fx-background-color: D72978; -fx-background-radius: 40;");
        button.setText("Sign In");
        button.setTextFill(javafx.scene.paint.Color.WHITE);
        button.setFont(new Font(25.0));

        label1.setLayoutX(72.0);
        label1.setLayoutY(359.0);
        label1.setText("Don't have account?");
        label1.setTextFill(javafx.scene.paint.Color.WHITE);

        label2.setLayoutX(205.0);
        label2.setLayoutY(355.0);
        label2.setOnMouseClicked(this::signUp);
        label2.setText("Sign Up");
        label2.setTextFill(javafx.scene.paint.Color.valueOf("#d72978"));
        label2.setFont(new Font(18.0));

        label3.setLayoutX(100.0);
        label3.setLayoutY(395.0);
        label3.setText("or play as a");
        label3.setTextFill(javafx.scene.paint.Color.WHITE);

        label4.setLayoutX(175.0);
        label4.setLayoutY(392.0);
        label4.setOnMouseClicked(this::guest);
        label4.setText("Guest");
        label4.setTextFill(javafx.scene.paint.Color.valueOf("#d72978"));
        label4.setFont(new Font(18.0));
        BorderPane.setMargin(anchorPane0, new Insets(50.0, 0.0, 50.0, 20.0));
        setLeft(anchorPane0);

        anchorPane.getChildren().add(imageView);
        anchorPane.getChildren().add(label);
        anchorPane0.getChildren().add(textField);
        anchorPane0.getChildren().add(imageView0);
        anchorPane0.getChildren().add(label0);
        anchorPane0.getChildren().add(imageView1);
        anchorPane0.getChildren().add(textField0);
        anchorPane0.getChildren().add(button);
        anchorPane0.getChildren().add(label1);
        anchorPane0.getChildren().add(label2);
        anchorPane0.getChildren().add(label3);
        anchorPane0.getChildren().add(label4);

    }
    
    protected void chooseModeScreen (Event action)
    {
        chooseModeSrc = new ChooseModeScr(stage);
        chooseModeSrc.setId("backG");
        stage = (Stage)((Node)action.getSource()).getScene().getWindow();
        scene = new Scene(chooseModeSrc,750,570);
        scene.getStylesheets().add(getClass()
                .getResource("/style/CSS_StyleSheet.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    protected void signIn(ActionEvent actionEvent)
    {
        try {
            

           if(DAL_1.isPlayerExist(textField.getText(),textField0.getText()))
           {
               DAL_1.updateStatus(textField.getText());
               
               chooseModeScreen(actionEvent);
           }else{
                 JOptionPane.showMessageDialog(null, "Please Check Username and Password ");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SignInScr.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    protected void signUp(javafx.scene.input.MouseEvent mouseEvent)
    {
        signUpSrc = new SignUpScr(stage);
        signUpSrc.setId("backG");
        stage = (Stage)((Node)mouseEvent.getSource()).getScene().getWindow();
        scene = new Scene(signUpSrc,750,570);
        scene.getStylesheets().add(getClass()
                .getResource("/style/CSS_StyleSheet.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
        
    }

    protected void guest(Event mouseEvent)
    {
        isGuest = true; 
        chooseModeScreen(mouseEvent);
        chooseModeSrc.button3.setVisible(false);
        chooseModeSrc.button1.setVisible(false);
        
    }

}

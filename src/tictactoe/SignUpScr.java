package tictactoe;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class SignUpScr extends BorderPane {

    protected final AnchorPane anchorPane;
    protected final Pane pane;
    protected final ImageView imageView;
    protected final ImageView imageView0;
    protected final ImageView imageView1;
    protected final ImageView imageView2;
    protected final TextField user_Name;
    protected final TextField E_Mail;
    protected final Label haveAcc;
    protected final Label label;
    protected final PasswordField passwordField;
    protected final PasswordField passwordField0;
    protected final Button button;
    protected final Label signInLabel;
    protected final ImageView imageView3;
    protected final Label ticTacToe;
    
    private SignInScr signInSrc;
    private Stage stage;
    private Scene scene;
    
    

    public SignUpScr(Stage stage) {

        anchorPane = new AnchorPane();
        pane = new Pane();
        imageView = new ImageView();
        imageView0 = new ImageView();
        imageView1 = new ImageView();
        imageView2 = new ImageView();
        user_Name = new TextField();
        E_Mail = new TextField();
        haveAcc = new Label();
        label = new Label();
        passwordField = new PasswordField();
        passwordField0 = new PasswordField();
        button = new Button();
        signInLabel = new Label();
        imageView3 = new ImageView();
        ticTacToe = new Label();

        anchorPane.setId("AnchorPane");
        anchorPane.setPrefHeight(534.0);
        anchorPane.setPrefWidth(752.0);

        pane.setLayoutX(33.0);
        pane.setLayoutY(57.0);
        pane.setPrefHeight(481.0);
        pane.setPrefWidth(323.0);
        pane.setStyle("-fx-background-color: E1C15C; -fx-background-radius: 20PX;");

        imageView.setFitHeight(44.0);
        imageView.setFitWidth(44.0);
        imageView.setLayoutX(9.0);
        imageView.setLayoutY(67.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("/images/boy_145865.png").toExternalForm()));

        imageView0.setFitHeight(35.0);
        imageView0.setFitWidth(58.0);
        imageView0.setLayoutX(14.0);
        imageView0.setLayoutY(138.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("/images/email_10678225.png").toExternalForm()));

        imageView1.setFitHeight(42.0);
        imageView1.setFitWidth(44.0);
        imageView1.setLayoutX(10.0);
        imageView1.setLayoutY(205.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("/images/padlock_301677.png").toExternalForm()));

        imageView2.setFitHeight(44.0);
        imageView2.setFitWidth(46.0);
        imageView2.setLayoutX(10.0);
        imageView2.setLayoutY(272.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        imageView2.setImage(new Image(getClass().getResource("/images/reset-password_6195699.png").toExternalForm()));

        user_Name.setAlignment(javafx.geometry.Pos.CENTER);
        user_Name.setLayoutX(75.0);
        user_Name.setLayoutY(75.0);
        user_Name.setPrefHeight(38.0);
        user_Name.setPrefWidth(217.0);
        user_Name.setPromptText("user Name");
        user_Name.setStyle("-fx-background-radius: 40;");

        E_Mail.setAlignment(javafx.geometry.Pos.CENTER);
        E_Mail.setLayoutX(74.0);
        E_Mail.setLayoutY(141.0);
        E_Mail.setPrefHeight(38.0);
        E_Mail.setPrefWidth(217.0);
        E_Mail.setPromptText("E-Mail");
        E_Mail.setStyle("-fx-background-radius: 40;");

        haveAcc.setLayoutX(58.0);
        haveAcc.setLayoutY(422.0);
        haveAcc.setText("Have an account ?");
        haveAcc.setTextFill(javafx.scene.paint.Color.WHITE);

        label.setLayoutX(114.0);
        label.setLayoutY(14.0);
        label.setText("Sing Up");
        label.setTextFill(javafx.scene.paint.Color.WHITE);
        label.setFont(new Font("AGA Arabesque", 32.0));

        passwordField.setAlignment(javafx.geometry.Pos.CENTER);
        passwordField.setLayoutX(74.0);
        passwordField.setLayoutY(211.0);
        passwordField.setPrefHeight(38.0);
        passwordField.setPrefWidth(217.0);
        passwordField.setPromptText("Password");
        passwordField.setStyle("-fx-background-radius: 40;");

        passwordField0.setAlignment(javafx.geometry.Pos.CENTER);
        passwordField0.setLayoutX(74.0);
        passwordField0.setLayoutY(279.0);
        passwordField0.setPrefHeight(38.0);
        passwordField0.setPrefWidth(217.0);
        passwordField0.setPromptText("Repeat password");
        passwordField0.setStyle("-fx-background-radius: 40;");

        button.setAlignment(javafx.geometry.Pos.CENTER);
        button.setLayoutX(108.0);
        button.setLayoutY(339.0);
        button.setMnemonicParsing(false);
        button.setOnAction(this::signUp);
        button.setPrefHeight(54.0);
        button.setPrefWidth(122.0);
        button.setStyle("-fx-background-color: #D72978; -fx-background-radius: 40;");
        button.setText("Sign UP");
        button.setTextFill(javafx.scene.paint.Color.WHITE);
        button.setFont(new Font(25.0));

        signInLabel.setLayoutX(175.0);
        signInLabel.setLayoutY(418.0);
        signInLabel.setOnMouseClicked(this::backToSignIn);
        signInLabel.setText("Sign In");
        signInLabel.setTextFill(javafx.scene.paint.Color.valueOf("#d72978"));
        signInLabel.setFont(new Font(18.0));

        imageView3.setFitHeight(165.0);
        imageView3.setFitWidth(206.0);
        imageView3.setLayoutX(448.0);
        imageView3.setLayoutY(112.0);
        imageView3.setPickOnBounds(true);
        imageView3.setPreserveRatio(true);
        imageView3.setImage(new Image(getClass().getResource("/images/logo.png").toExternalForm()));

        ticTacToe.setId("ticTacToe");
        ticTacToe.setLayoutX(384.0);
        ticTacToe.setLayoutY(300.0);
        ticTacToe.setText("Tic Tac Toe");
        ticTacToe.setFont(new Font(70.0));
        ticTacToe.setTextFill(new LinearGradient(
            0, 0, 1, 0, true,  
            javafx.scene.paint.CycleMethod.NO_CYCLE,  
            new Stop(0, Color.rgb(255, 194, 1)),  
            new Stop(1, Color.rgb(215, 41, 120))
        ));
        setCenter(anchorPane);

        pane.getChildren().add(imageView);
        pane.getChildren().add(imageView0);
        pane.getChildren().add(imageView1);
        pane.getChildren().add(imageView2);
        pane.getChildren().add(user_Name);
        pane.getChildren().add(E_Mail);
        pane.getChildren().add(haveAcc);
        pane.getChildren().add(label);
        pane.getChildren().add(passwordField);
        pane.getChildren().add(passwordField0);
        pane.getChildren().add(button);
        pane.getChildren().add(signInLabel);
        anchorPane.getChildren().add(pane);
        anchorPane.getChildren().add(imageView3);
        anchorPane.getChildren().add(ticTacToe);

    }


    protected void signUp(javafx.event.ActionEvent actionEvent)
    {
        
    }

    protected void backToSignIn(javafx.scene.input.MouseEvent mouseEvent)
    {
        signInSrc = new SignInScr(stage);
        signInSrc.setId("backG");
        stage = (Stage)((Node) mouseEvent.getSource()).getScene().getWindow();
        scene = new Scene(signInSrc,750,570);
        scene.getStylesheets().add(getClass()
                .getResource("/style/CSS_StyleSheet.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
        
    }

}

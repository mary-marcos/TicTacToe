package tictactoe;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class GameOnlineSrc extends AnchorPane {

    protected final Label label;
    protected final Label label0;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final Button btn1;
    protected final Button btn4;
    protected final Button btn03;
    protected final Button btn7;
    protected final Button btn6;
    protected final Button btn9;
    protected final Button btn2;
    protected final Button btn5;
    protected final Button btn8;
    protected final Label label1;
    protected final Label label2;
    protected final Button RecordBtn;
    protected final Button ScreenShotBtn;
    protected final Button backBtn;
    protected final TextArea textArea;
    protected final TextField chat_txt;
    protected final Label label3;
    protected final Label label4;
    protected final Label label5;
    protected final Label label6;
    protected final StackPane triangleButtonPane;
    protected final Button triangleButton;

    public GameOnlineSrc(Stage stage) {

        label = new Label();
        label0 = new Label();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        btn1 = new Button();
        btn4 = new Button();
        btn03 = new Button();
        btn7 = new Button();
        btn6 = new Button();
        btn9 = new Button();
        btn2 = new Button();
        btn5 = new Button();
        btn8 = new Button();
        label1 = new Label();
        label2 = new Label();
        RecordBtn = new Button();
        ScreenShotBtn = new Button();
        backBtn = new Button();
        textArea = new TextArea();
        chat_txt = new TextField();
        label3 = new Label();
        label4 = new Label();
        label5 = new Label();
        label6 = new Label();
        triangleButtonPane = new StackPane();
        triangleButton = new Button();

        setId("ticTacToe");
        setPrefHeight(570.0);
        setPrefWidth(750.0);
        setStyle("-fx-border-color: black;");

        label.setAlignment(javafx.geometry.Pos.CENTER);
        label.setId("ticTacToe");
        label.setLayoutX(100.0);
        label.setLayoutY(32.0);
        label.setPrefHeight(47.0);
        label.setPrefWidth(570.0);
        label.setText("multi players online");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#d72978"));
        label.setFont(new Font(17.0));

        label0.setAlignment(javafx.geometry.Pos.CENTER);
        label0.setId("black");
        label0.setLayoutX(402.0);
        label0.setLayoutY(121.0);
        label0.setPrefHeight(27.0);
        label0.setPrefWidth(58.0);
        label0.setStyle("-fx-background-color: white; -fx-background-radius: 20px;");
        label0.setText("0");
        label0.setFont(new Font(20.0));

        gridPane.setLayoutX(44.0);
        gridPane.setLayoutY(215.0);
        gridPane.setPrefHeight(252.0);
        gridPane.setPrefWidth(387.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        btn1.setId("yellow2");
        btn1.setMnemonicParsing(false);
        btn1.setPrefHeight(84.0);
        btn1.setPrefWidth(120.0);
        btn1.setStyle("-fx-background-color: white;");
        btn1.getStyleClass().add("ticTacToe");
        btn1.setText("btn");
        GridPane.setMargin(btn1, new Insets(5.0));
        btn1.setFont(new Font(9.0));

        GridPane.setRowIndex(btn4, 1);
        btn4.setMnemonicParsing(false);
        btn4.setPrefHeight(83.0);
        btn4.setPrefWidth(132.0);
        btn4.setStyle("-fx-background-color: white;");
        btn4.getStyleClass().add("ticTacToe");
        GridPane.setMargin(btn4, new Insets(5.0));

        GridPane.setColumnIndex(btn03, 2);
        btn03.setMnemonicParsing(false);
        btn03.setPrefHeight(84.0);
        btn03.setPrefWidth(124.0);
        btn03.setStyle("-fx-background-color: white;");
        btn03.getStyleClass().add("ticTacToe");
        btn03.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        btn03.setTextFill(javafx.scene.paint.Color.valueOf("#9e6d6d"));
        GridPane.setMargin(btn03, new Insets(5.0));

        GridPane.setRowIndex(btn7, 2);
        btn7.setMnemonicParsing(false);
        btn7.setPrefHeight(83.0);
        btn7.setPrefWidth(157.0);
        btn7.setStyle("-fx-background-color: white;");
        btn7.getStyleClass().add("ticTacToe");
        GridPane.setMargin(btn7, new Insets(5.0));

        GridPane.setColumnIndex(btn6, 2);
        GridPane.setRowIndex(btn6, 1);
        btn6.setMnemonicParsing(false);
        btn6.setPrefHeight(74.0);
        btn6.setPrefWidth(137.0);
        btn6.setStyle("-fx-background-color: white;");
        btn6.getStyleClass().add("ticTacToe");
        GridPane.setMargin(btn6, new Insets(5.0));

        GridPane.setColumnIndex(btn9, 2);
        GridPane.setRowIndex(btn9, 2);
        btn9.setMnemonicParsing(false);
        btn9.setPrefHeight(83.0);
        btn9.setPrefWidth(154.0);
        btn9.setStyle("-fx-background-color: white;");
        btn9.getStyleClass().add("ticTacToe");
        GridPane.setMargin(btn9, new Insets(5.0));

        GridPane.setColumnIndex(btn2, 1);
        btn2.setMnemonicParsing(false);
        btn2.setPrefHeight(84.0);
        btn2.setPrefWidth(130.0);
        btn2.setStyle("-fx-background-color: white;");
        btn2.getStyleClass().add("ticTacToe");
        GridPane.setMargin(btn2, new Insets(5.0));

        GridPane.setColumnIndex(btn5, 1);
        GridPane.setRowIndex(btn5, 1);
        btn5.setMnemonicParsing(false);
        btn5.setPrefHeight(82.0);
        btn5.setPrefWidth(150.0);
        btn5.setStyle("-fx-background-color: white;");
        btn5.getStyleClass().add("ticTacToe");
        GridPane.setMargin(btn5, new Insets(5.0));

        GridPane.setColumnIndex(btn8, 1);
        GridPane.setRowIndex(btn8, 2);
        btn8.setMnemonicParsing(false);
        btn8.setPrefHeight(83.0);
        btn8.setPrefWidth(176.0);
        btn8.setStyle("-fx-background-color: white;");
        btn8.getStyleClass().add("ticTacToe");
        GridPane.setMargin(btn8, new Insets(5.0));

        label1.setId("yellow2");
        label1.setLayoutX(215.0);
        label1.setLayoutY(154.0);
        label1.setText("x");
        label1.setFont(new Font(18.0));

        label2.setId("pink");
        label2.setLayoutX(543.0);
        label2.setLayoutY(154.0);
        label2.setText("o");
        label2.setFont(new Font(18.0));

        RecordBtn.setLayoutX(323.0);
        RecordBtn.setLayoutY(512.0);
        RecordBtn.setLayoutX(323.0);
        RecordBtn.setLayoutY(512.0);
        RecordBtn.setMnemonicParsing(false);
        RecordBtn.setPrefHeight(38.0);
        RecordBtn.setPrefWidth(103.0);
        RecordBtn.setStyle("-fx-background-color: #FFC201; -fx-background-radius: 20px;");
        RecordBtn.setText("Record Game");
        RecordBtn.setTextFill(javafx.scene.paint.Color.valueOf("#f2f2f2"));

        ScreenShotBtn.setLayoutX(517.0);
        ScreenShotBtn.setLayoutY(512.0);
        ScreenShotBtn.setMnemonicParsing(false);
        ScreenShotBtn.setPrefHeight(38.0);
        ScreenShotBtn.setPrefWidth(103.0);
        ScreenShotBtn.setStyle("-fx-background-color: #FFC201; -fx-background-radius: 20px;");
        ScreenShotBtn.setText("Screen Shot");
        ScreenShotBtn.setTextFill(javafx.scene.paint.Color.valueOf("#fffefe"));

        backBtn.setLayoutX(117.0);
        backBtn.setLayoutY(512.0);
        backBtn.setMnemonicParsing(false);
        backBtn.setPrefHeight(38.0);
        backBtn.setPrefWidth(103.0);
        backBtn.setStyle("-fx-background-color: #FFC201; -fx-background-radius: 20px;");
        backBtn.setText("back");
        backBtn.setTextFill(javafx.scene.paint.Color.valueOf("#fffafa"));

        AnchorPane.setBottomAnchor(textArea, 155.0);
        textArea.setLayoutX(479.0);
        textArea.setLayoutY(215.0);
        textArea.setPrefHeight(197.0);
        textArea.setPrefWidth(200.0);
        textArea.setStyle("-fx-border-color: black; -fx-border-radius: 10px; -fx-background-radius: 60px;");

        chat_txt.setLayoutX(479.0);
        chat_txt.setLayoutY(422.0);
        chat_txt.setPrefHeight(38.0);
        chat_txt.setPrefWidth(200.0);
        chat_txt.setStyle("-fx-border-color: black; -fx-border-radius: 10px; -fx-background-radius: 15px;");

        label3.setAlignment(javafx.geometry.Pos.CENTER);
        label3.setId("black");
        label3.setLayoutX(291.0);
        label3.setLayoutY(123.0);
        label3.setPrefHeight(27.0);
        label3.setPrefWidth(58.0);
        label3.setStyle("-fx-background-color: white; -fx-background-radius: 20px;");
        label3.setText("0");
        label3.setFont(new Font(18.0));

        label4.setId("black");
        label4.setLayoutX(374.0);
        label4.setLayoutY(127.0);
        label4.setText(":");
        label4.setFont(new Font(18.0));

        label5.setLayoutX(187.0);
        label5.setLayoutY(114.0);
        label5.setText("player 1");
        label5.setTextFill(javafx.scene.paint.Color.valueOf("#fffefe"));
        label5.setFont(new Font(18.0));

        label6.setLayoutX(511.0);
        label6.setLayoutY(108.0);
        label6.setText("player 2");
        label6.setTextFill(javafx.scene.paint.Color.valueOf("#fffefe"));
        label6.setFont(new Font(18.0));

        // Triangle button setup
        triangleButtonPane.setLayoutX(684.0);
        triangleButtonPane.setLayoutY(422.0);
        triangleButtonPane.setPrefHeight(38.0);
        triangleButtonPane.setPrefWidth(38.0);

        triangleButton.setMnemonicParsing(false);
        triangleButton.setPrefHeight(38.0);
        triangleButton.setPrefWidth(38.0);
        triangleButton.setStyle("-fx-background-color: #FFC201; -fx-background-radius: 50%;");
        triangleButton.setText("▶");
        triangleButton.setFont(new Font(20.0));
        triangleButton.setTextFill(javafx.scene.paint.Color.valueOf("#fffafa"));

        triangleButtonPane.getChildren().add(triangleButton);

        getChildren().add(label);
        getChildren().add(label0);
        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getChildren().add(btn1);
        gridPane.getChildren().add(btn4);
        gridPane.getChildren().add(btn03);
        gridPane.getChildren().add(btn7);
        gridPane.getChildren().add(btn6);
        gridPane.getChildren().add(btn9);
        gridPane.getChildren().add(btn2);
        gridPane.getChildren().add(btn5);
        gridPane.getChildren().add(btn8);
        getChildren().add(gridPane);
        getChildren().add(label1);
        getChildren().add(label2);
        getChildren().add(RecordBtn);
        getChildren().add(ScreenShotBtn);
        getChildren().add(backBtn);
        getChildren().add(textArea);
        getChildren().add(chat_txt);
        getChildren().add(label3);
        getChildren().add(label4);
        getChildren().add(label5);
        getChildren().add(label6);
        getChildren().add(triangleButtonPane);

    }
}

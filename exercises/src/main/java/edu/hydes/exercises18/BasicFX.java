package edu.hydes.exercises18;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.AccessibleAction;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.*;

public class BasicFX extends Application{

    private int clickCnt = 0;

    public int getClickCount(){
        return clickCnt;
    }
    public void setClickCount(int cnt){
        clickCnt = cnt;
    }
    private class InnerOKButtonListener implements EventHandler<ActionEvent> {
        EventHandler<ActionEvent> eh = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                Node n = (Node) event.getSource();

                if (n instanceof Button b) {
                    b.setText(b.getText() + "!");
                    System.out.println("Button pressed!");

                    clickCnt++;

                }
            }

        };

        public void start(Stage primaryStage) {
            Label clickLabel = new Label("Click Count: 0");


            Button btOK = new Button("OK");
            //btOK.setOnAction(new OKButtonListener(this));
            btOK.setOnAction(new InnerOKButtonListener());


            Button[] numButtons = new Button[5];
            for (int i = 0; i < numButtons.length; i++) {
                numButtons[i] = new Button("" + 1);
            }

            GridPane pane = new GridPane();
            pane.add(numButtons[0], 0, 0);
            pane.add(numButtons[1], 2, 0);
            pane.add(numButtons[2], 0, 2);
            pane.add(numButtons[3], 2, 2);
            pane.add(numButtons[4], 1, 1);

            BorderPane masterPane = new BorderPane();
            masterPane.setTop(clickLabel);
            masterPane.setCenter(btOK);
            masterPane.setBottom(pane);


            Scene scene = new Scene(masterPane, 800, 600);

            primaryStage.setScene(scene);
            primaryStage.setTitle("BEHOLD!");
            primaryStage.show();

        }

        public static void main(String[] args) {
            launch(args);
        }
    }
}

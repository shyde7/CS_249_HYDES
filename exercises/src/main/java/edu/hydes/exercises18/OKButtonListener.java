package edu.hydes.exercises18;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class OKButtonListener implements EventHandler<ActionEvent> {
    public void handle(ActionEvent event) {
        System.out.println("OK button clicked");
    }
}

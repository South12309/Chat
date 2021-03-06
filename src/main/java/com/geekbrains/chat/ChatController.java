package com.geekbrains.chat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ChatController {
    @FXML
    private TextArea messageArea;
    @FXML
    private TextField messageField;

    @FXML
    public void sendClick(ActionEvent actionEvent) {
        messageArea.appendText(messageField.getText() + "\n");
        messageField.clear();
    }
}
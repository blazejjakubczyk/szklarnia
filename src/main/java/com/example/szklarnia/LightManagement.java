package com.example.szklarnia;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LightManagement {

    private Parent fxmlLoader;
    private Stage stage;
    private Scene scene;
    @FXML
    protected void cancel(ActionEvent event) throws IOException {

        fxmlLoader = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader);
        stage.setTitle("Main");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void save(ActionEvent event) throws IOException {

        fxmlLoader = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader);
        stage.setTitle("Main");
        stage.setScene(scene);
        stage.show();
        /*Tu cos do zapisu danych*/
    }
}

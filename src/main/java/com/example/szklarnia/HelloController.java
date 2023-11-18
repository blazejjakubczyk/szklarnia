package com.example.szklarnia;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;
    private FXMLLoader fxmlLoader;
    private Stage stage;
    private Scene scene;

    @FXML
    protected void onLightButtonClick() {
        welcomeText.setText("Zarządzanie oSwietleniem!");
    }


    public void switchToSceneRegister(MouseEvent event) throws IOException {

        fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("RegisterScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add(getClass().getResource("stylesheet.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onWaterButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onAirButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
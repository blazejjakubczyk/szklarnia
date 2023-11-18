package com.example.szklarnia;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;
    private Parent fxmlLoader;
    private Stage stage;
    private Scene scene;

    @FXML
    protected void switchToLightManagement(ActionEvent event) throws IOException {

        fxmlLoader = FXMLLoader.load(getClass().getResource("LightManagement.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader);
        stage.setTitle("LightManagement");
        stage.setScene(scene);
        stage.show();
    }


    public void switchToFertilizerManagement(ActionEvent event) throws IOException {

        fxmlLoader = FXMLLoader.load(getClass().getResource("FertilizerManagement.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader);
        stage.setTitle("FertilizerManagement");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void switchToPlantProtection(ActionEvent event) throws IOException {

        fxmlLoader = FXMLLoader.load(getClass().getResource("PlantProtection.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader);
        stage.setTitle("FertilizerManagement");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void switchToAirManagement(ActionEvent event) throws IOException {

        fxmlLoader = FXMLLoader.load(getClass().getResource("AirManagement.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader);
        stage.setTitle("AirManagement");
        stage.setScene(scene);
        stage.show();
    }
}
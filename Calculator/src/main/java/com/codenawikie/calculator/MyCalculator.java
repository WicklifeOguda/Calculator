package com.codenawikie.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class MyCalculator extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MyCalculator.class.getResource("my-calc-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        scene.setFill(Color.TRANSPARENT);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        String css =  this.getClass().getResource("myCalc.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
package com.isep.rpg;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Main extends Application {
    private static Scene scene;
    static ArrayList<Hero> heroes = new ArrayList();
    static ArrayList<Enemy> enemies = new ArrayList<>();
    @Override
    public void start(Stage stage) throws IOException {

        scene = new Scene(loadFXML("primary"), 800, 600);
        stage.setScene(scene);
        stage.show();

    }
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }


    public static void main(String[] args) {
        launch();
    }
}

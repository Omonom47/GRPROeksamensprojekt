package com.example.eksmansprojekt;

import com.example.eksmansprojekt.presentation.Viewer;
import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application{
    public static void main(String[] args){
        Viewer view = new Viewer();
        view.test();
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        /*Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Test af Streamingtjeneste");

        //stage.setWidth(700);
        //stage.setHeight(700);
        stage.setResizable(true);
        //stage.setFullScreen(true);*/



        //stage.setScene(scene);
        stage.show();
    }
}

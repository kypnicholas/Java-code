package com.kypnicholas.todolist;

import com.kypnicholas.todolist.datamodel.TodoData;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("mainwindow.fxml"));
        primaryStage.setTitle("TO DO LIST");
        primaryStage.setScene(new Scene(root, 900, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);

        }

    //WHEN WE STOP OUR APP IT RUNS THE METHOD BELOW AND STORES THE ITEMS IN THE TEXT FILE
    @Override
    public void stop() throws Exception {
        try {
            TodoData.getInstance().storeTodoItems();        //Gets our Singleton instance and SAVE THE DATA IN A TEXT FILE
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }


    //OVER-WRITE OUR INITIALIZATION METHOD TO LOAD THE TO-DO ITEMS FROM THE TEXT FILE WE CREATED
    @Override
    public void init() throws Exception {
        try {
            TodoData.getInstance().loadTodoItems();         //
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

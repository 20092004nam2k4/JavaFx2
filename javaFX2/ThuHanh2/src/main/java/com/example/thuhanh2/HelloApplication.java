package com.example.thuhanh2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("student.list.fxml"));
        VBox root = loader.load();
        StudentListController controller = loader.getController();

        // Add sample data
        controller.getListView().getItems().addAll(
                new Student(1, "John Doe", 20),
                new Student(2, "Jane Smith", 22),
                new Student(3, "David Johnson", 19)
        );

        primaryStage.setTitle("Student List");
        primaryStage.setScene(new Scene(root, 200, 300));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}
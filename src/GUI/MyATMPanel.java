package GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

 /**************************************************
 * Creates ATM panel for the GUI
 **************************************************/

public class MyATMPanel extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("/MyATMPanel.fxml"));

            Scene scene = new Scene(root);

            primaryStage.setScene(scene);
            primaryStage.setTitle("GUI.ATM GUI");
            primaryStage.setResizable(false);
            primaryStage.show();
        }

        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){

        launch(args);
    }
}

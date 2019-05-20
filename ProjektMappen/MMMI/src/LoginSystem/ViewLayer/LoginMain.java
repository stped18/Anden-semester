/*
 * 
 * 
 * 
 */
package LoginSystem.ViewLayer;

import java.io.IOException;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import mmmi.UI.Main.*;

/**
 *
 * @author steff
 */
public class LoginMain extends Application {

   

    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage stage) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("LoginSystem.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("MMMI Loginsystem");
        stage.setScene(scene);
        stage.show();

    }

    

}




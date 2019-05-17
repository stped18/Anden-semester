package LoginSystem.ViewLayer;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

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






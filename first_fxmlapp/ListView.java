/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_fxmlapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

 public class ListView extends Application {
     @Override
            public void start (Stage stage) throws Exception {
                Parent root =FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
                
                Scene scene = new Scene (root);
                stage.setScene(scene);
                stage.show();
            }
            
public static void main(String[] args) {
        launch(args);
    }
    Object getItems() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getSelectionModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_fxmlapp;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

/**
 *
 * @author nuseybe
 */
public class FXMLDocumentController implements Initializable {
         
ObservableList list = FXCollections.observableArrayList();
        
    
    private ListView<String> movieList;
    @FXML
    private Button button;
    @FXML
    private Label label;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loadData();
    }    
    private  void loadData(){
        list.removeAll(list);
        String a ="Transporter";
        String b="Shazam!";
        String c="Inception";
        String d="Joker";
        String e="Deadpool";
        String f="Truman Show";
        list.addAll (a,b,c,d,e,f);
        movieList.getItems().addAll(list);
                     
    }

    private void displaySelected(MouseEvent event) {
        String movie= movieList.getSelectionModel().getSelectedItem();
        if(movie==null|| movie.isEmpty()){
            screen.setText("Nothing Selected");
             }
        else {
              screen.setText(movie +" selected");
                    
                }
       
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
    }
}

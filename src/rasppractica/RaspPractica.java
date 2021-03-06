/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rasppractica;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import client.ClientAsincron;

/**
 *Clase principal de la aplicacion.
 * Esta clase inicia la interficie
 * 
 */
public class RaspPractica extends Application {
    
   ClientAsincron fil = new ClientAsincron();
   FXMLDocumentController bucle = new FXMLDocumentController();
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument2.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show(); 
        stage.setTitle("Raspberry Control.");

        
        fil.start();  
        
        Thread.sleep(2000);
        bucle.BucleCheck();
        
    }


    public static void main(String[] args) {
        launch(args);
        
        
    }
    
}

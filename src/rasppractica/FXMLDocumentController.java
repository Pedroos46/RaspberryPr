/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rasppractica;

import XMLRW.XMLWriter;
import client.Client;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.scene.control.Label;
import static sun.plugin.javascript.navig.JSType.Document;

/**
 *
 * @author aleix
 */



public class FXMLDocumentController implements Initializable {
    
    int LGrup1 = 0;
    int LGrup2 = 0;
XMLWriter EscriuXML = new XMLWriter();
       
        
        String LedGrup1 = "Apagat";
        String LedGrup1Count = Integer.toString(LGrup1);
        
       
        String LedGrup2= "Apagat" ;
        String LedGrup2Count= Integer.toString(LGrup2);
                    
        int nLuz = 0 ;
        String Luz= "Apagat";
        String LuzCount= Integer.toString(nLuz); 
        
        int nPito = 0;
        String Pito= "Apagat"; 
        String PitoCount= Integer.toString(nPito);
        
        int nBoto = 0;
        String Boton= "Apagat";
        String BotoCount= Integer.toString(nBoto);
        
        int nServoCount = 0;
        String Servo= "Apagat";
        String ServoCount= Integer.toString(nServoCount);
        
        
    @FXML public Label alarma;
    @FXML private Label servo;
    @FXML public Text llum; 
    @FXML public Label coneccio;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    @FXML public void BotoConectar(ActionEvent event) throws Exception {
       Thread.sleep(1000);
        if(Client.client() == true){
            coneccio.setText("Conectat");
            //TODO: INHABILITAT EL BOTO
        }else {
            coneccio.setText("Sense Conexio");
        }
      
    }
    
    
    
    @FXML public void BotoLed1(ActionEvent event) {
        LGrup1 = LGrup1++;
        LedGrup1 = "Ences";
        LedGrup1Count = Integer.toString(LGrup1);
        
        EscriuXML.vHistorialAccionsXML(LedGrup1, LedGrup1Count, LedGrup2, LedGrup2Count, Luz, LuzCount, Pito, PitoCount, Boton, BotoCount, Servo, ServoCount);

    }
    
   
    @FXML public void BotoLed2(ActionEvent event) {
        LGrup2 = LGrup2++;
        LedGrup2= "Ences";
        LedGrup1Count = Integer.toString(LGrup2);

        EscriuXML.vHistorialAccionsXML(LedGrup1, LedGrup1Count, LedGrup2, LedGrup2Count, Luz, LuzCount, Pito, PitoCount, Boton, BotoCount, Servo, ServoCount);

    }

    
    @FXML public void BotoAlarma(ActionEvent event) {
        nPito = nPito++;
        Pito= "Ences";
        LedGrup1Count = Integer.toString(nPito);

        EscriuXML.vHistorialAccionsXML(LedGrup1, LedGrup1Count, LedGrup2, LedGrup2Count, Luz, LuzCount, Pito, PitoCount, Boton, BotoCount, Servo, ServoCount);

    }
    
  
    
}

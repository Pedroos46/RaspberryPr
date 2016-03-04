/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rasppractica;

import DataStructures.ArrayListClass;

import InternalClass.OuterClass;
import XMLRW.XMLWriter;
import XMLRW.XMLReader;
import client.Client;
import client.ClientAsincron;
import client.ClientServo;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.scene.control.Label;
import static sun.plugin.javascript.navig.JSType.Document;

/**
 *
 * @author aleix
 */



public class FXMLDocumentController implements Initializable {  
    
    //XML
    XMLWriter EscriuXML = new XMLWriter();
    XMLReader LlegeixXML = new XMLReader();
    
    //CLIENTS
    Client client = new Client();
    ClientServo servo = new ClientServo(){};
    ClientAsincron asincron = new ClientAsincron();
    
    //OTHER
    OuterClass outer=new OuterClass();
    ArrayListClass array = new ArrayListClass();



        Integer LGrup1 = 0;
        String LedGrup1 = "Apagat";
        
        Integer LGrup2 = 0;
        String LedGrup2= "Apagat" ;
                    
        Integer nLuz = 0 ;
        String Luz= "Apagat"; //ASINCRONO O POTSE SINCRONO PERO NO ENCARA VAL, POTSE LE POSO ALLA A UN FIL A CORRE I ENGA 
        
        Integer nPito = 0;
        String Pito= "Apagat"; 
        
        int nBoto = 0;
        String Boton= "Apagat"; //ASINCRONO O POTSE SICRONO PERO NO ENCARA VAL, EL FIL YA ESTA SHA DE FER EL BUCLE DE LECTURA Y A FUNCIO A SERVER HOLER AJUDAM AMB AIXO
        
        int nServoCount = 0;
        String Servo= "Apagat";
        

    @FXML public Label coneccio;
    @FXML public Label estatled1;
    @FXML public Label estatled2;
    @FXML public Label estatalarma;
   //@FXML public Label boto;
   //@FXML public Label llum;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    @FXML public void BotoConectar(ActionEvent event) throws Exception {
        Thread.sleep(750);
        if(Client.client() == true){
            coneccio.setText("Connectat");
        }else {
            coneccio.setText("Sense Conexió");
        }
    }
    
    //XML
    @FXML public void BotoGuardar(ActionEvent event) {
        
        String LedGrup1Count = Integer.toString(LGrup1);
        String LedGrup2Count = Integer.toString(LGrup2);
        String LuzCount= Integer.toString(nLuz); 
        String PitoCount= Integer.toString(nPito);
        String BotoCount= Integer.toString(nBoto);
        String ServoCount= Integer.toString(nServoCount);

        EscriuXML.vHistorialAccionsXML(LedGrup1, LedGrup1Count, LedGrup2, LedGrup2Count,
                Luz, LuzCount, Pito, PitoCount, Boton, BotoCount, Servo, ServoCount);
    }
    
    @FXML public void BotoCargar(ActionEvent event) throws Exception{
        LlegeixXML.vHistorialAccionsXML();
        Thread.sleep(1000);
        array.cargaArrayList();
        Thread.sleep(750);
        
        try{
            System.out.print("\n");
            LGrup1 = array.getData(2);
            LGrup2 = array.getData(1);
            nLuz = array.getData(0);
            nPito = array.getData(3);
            nBoto = array.getData(4);
            nServoCount = array.getData(5);
            System.out.print(LGrup1 + " " + LGrup2 + " " + nLuz + " " + nPito + " " + nBoto + " " + nServoCount + "\n");
        }catch (Exception e) {
        System.err.println(e.getMessage());
        } 

    }
    
     int stateBoto1 = 0; 
    @FXML public void BotoLed1(ActionEvent event) throws Exception {
        outer.cridarInner();

        if(stateBoto1 == 0){
            LGrup1++;
            LedGrup1 = "Ences";
            client.EncendreLedGrup1();
            estatled1.setText("ON");
            stateBoto1 = 1;
        }else{if(stateBoto1 == 1){
            LedGrup1 = "Apagat";   
            client.ApagarLedGrup1();
            estatled1.setText("OFF");
            stateBoto1 = 0;
            }
        }  
    }
    
   int stateBoto2 = 0; 
    @FXML public void BotoLed2(ActionEvent event) throws Exception {
        outer.cridarInner();
         
        if(stateBoto2 == 0){
            LGrup2++;
            LedGrup2 = "Ences";
            client.EncendreLedGrup2();
            estatled2.setText("ON");
            stateBoto2 = 1;
        }else{if(stateBoto2 == 1){
            LedGrup2 = "Apagat";   
            client.ApagarLedGrup2();
            estatled2.setText("OFF");
            stateBoto2 = 0;
            }
        }
    }

    int stateAlarma = 0; 
    @FXML public void BotoAlarma(ActionEvent event) throws Exception {
        outer.cridarInner();
        
        if(stateAlarma == 0){
            nPito++;
            Pito = "Ences";
            client.EncendrePito();
            estatalarma.setText("ON");
            stateAlarma = 1;
        }else{if(stateAlarma == 1){
            Pito = "Apagat";   
            client.ApagarPito();
            estatalarma.setText("OFF");
            stateAlarma = 0;
            }
        }
    }
    
    int stateBotoServo = 0; 
    @FXML public void BotoActivaServo(ActionEvent event) throws Exception {
        outer.cridarInner();
        
        if(stateBoto1 == 0){
            nServoCount++;
            Servo = "Ences";
            servo.Servo();
            stateBoto1 = 1;
        }else{if(stateBoto1 == 1){
            LedGrup1 = "Apagat";   
            stateBoto1 = 0;
            }
        }
        
    }
    
  
    
}

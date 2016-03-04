package client;

import api.Api;
import api.Data;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * Clase asincronoa.
 * Esta clase crea un hilo Asincrono donde lee el boton y el LDR
 */
public class ClientAsincron extends Thread {
    public ClientAsincron(){}
    
    private static final String HOST = "192.168.1.3"; //localhost
    private static final int PORT = 1080;
    private static Registry registre;
    
    public int nEstatLDR;
    public int nEstatBoto;
    
    public String estatLDREnvio;
    public String estatBotoEnvio;
    
    @FXML public Label boto;
    @FXML public Label llum;
    
    @Override
    public void run(){  
                /**Metodo que arranca el hilo*/

        while(true){
            System.out.println("FIL SINCRON PER LDR O BOTO");
            
            try {
                Thread.sleep(750);
            } catch (InterruptedException ex) {
                Logger.getLogger(ClientAsincron.class.getName()).log(Level.SEVERE, null, ex);
            }
       
            try {
                nEstatLDR = LlegirLDR();
            } catch (Exception ex) {
                Logger.getLogger(ClientAsincron.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                nEstatBoto = LlegirBoto();
            } catch (Exception ex) {
                Logger.getLogger(ClientAsincron.class.getName()).log(Level.SEVERE, null, ex);
            }
     
        }  
    }
    
    public int LlegirLDR() throws Exception{
               /**Metodo que lee el LDR*/

        int returnedData = 5;
        try{
            registre = LocateRegistry.getRegistry(HOST, PORT);
            Api remoteApi = (Api) registre.lookup(Api.class.getSimpleName());

            returnedData = (remoteApi.LlegirLDR(new Data(1)).getValor());
            System.out.println("LDR:" + returnedData);
        }catch (RemoteException | NotBoundException e){
             System.err.println(e.getMessage());
        }
        
        return returnedData;
    }
     
    public int LlegirBoto() throws Exception{
                /**Metodo que lee el boton*/

        int returnedData = 5;
        try{
            registre = LocateRegistry.getRegistry(HOST, PORT);
            Api remoteApi = (Api) registre.lookup(Api.class.getSimpleName());

            returnedData = (remoteApi.LlegirBoto(new Data(1)).getValor());
            System.out.println("Boto:" + returnedData);
        }catch (RemoteException | NotBoundException e){
             System.err.println(e.getMessage());
        }
    
        return returnedData;
    }
    
  public void BucleAsincron(){
              /**bucle Asincrono*/
 
      while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ClientAsincron.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.print("Comprovacio asincrona funcionant.\n");
            
            int tempLuz;
            try{
                tempLuz = nEstatLDR ;
                if (tempLuz == 1){
                   estatLDREnvio = "Amb llum";
                } else {
                   estatLDREnvio = "Sense Llum";

                }
            }catch (Exception e) {
            System.err.println(e.getMessage());
            } 
            
            int tempBoto;
            try{
                tempBoto = nEstatBoto;
                if (tempBoto == 1){
                    estatBotoEnvio = "Pulsat";

                }else{
                    estatBotoEnvio = "No pulsat";
                    
                }
            }catch (Exception e) {
            System.err.println(e.getMessage());
            } 
             
        }
    }   
}

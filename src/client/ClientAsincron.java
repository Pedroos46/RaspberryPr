package client;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Roger
 */
public class ClientAsincron extends Thread {
    public ClientAsincron(){}
    
    @Override
    public void run(){  
        
        while(true){
            System.out.println("fill corrent");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ClientAsincron.class.getName()).log(Level.SEVERE, null, ex);
                }
        }  
    }  
    
      
}

/*
 * To change this license header, choose License Headers in Project Properties..
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import api.Api;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Roger
 */
public class ClientServo extends Servo{
    public ClientServo(){}
    
    private static final String HOST = "192.168.1.3"; //localhost
    private static final int PORT = 1080;
    private static Registry registre;
    
    /**
     *
     * Clase Diferida.
     * Esta clase hereda de servo
     */
    @Override
    public void Servo() throws Exception{
        try{
            registre = LocateRegistry.getRegistry(HOST, PORT);
            Api remoteApi = (Api) registre.lookup(Api.class.getSimpleName()); 
            
            
        }catch (RemoteException | NotBoundException e){
             System.err.println(e.getMessage());
        }
        
    }
 
}

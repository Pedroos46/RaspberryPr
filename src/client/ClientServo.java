/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import api.Api;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Roger
 */
public abstract class ClientServo {
    public ClientServo(){}
    
    private static final String HOST = "127.0.1.1"; //localhost
    private static final int PORT = 1080;
    private static Registry registre;
    
    
    public void Servo() throws Exception{
        registre = LocateRegistry.getRegistry(HOST, PORT);
        Api remoteApi = (Api) registre.lookup(Api.class.getSimpleName());
        registre = LocateRegistry.getRegistry(HOST, PORT);
        
        
    
        
    }
 
}

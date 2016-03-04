package client;

import api.Api;
import api.Data;
import java.io.IOException;
import java.rmi.ConnectException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.UnknownHostException;
import java.rmi.registry.*;

/**
 * Clase que implementa un cliente RMI
 * Para implementar este código en diferentes máquinas se necesitan 3 archivos jar :
 * Api.jar : Api.java , Data.java
 * Server.jar : Server.java , ApiImpl.java
 * Client.jar : Client.java
 * En el equipo del servidor contendrá api.jar y server.jar
 * En el equipo cliente contendrá api.jar y client.jar

 */
public class Client {
    public Client(){}
    
    private static final String HOST = "192.168.1.3"; //localhost
    private static final int PORT = 1080;
    private static Registry registre;

    
    public static boolean client() throws Exception {
        int returnedData = 0;
        try { 
            registre = LocateRegistry.getRegistry(HOST, PORT);
            Api remoteApi = (Api) registre.lookup(Api.class.getSimpleName());

           
            returnedData = (remoteApi.Conectivitat(new Data(1)).getValor());
            System.out.println("Conectivitat:" + returnedData);

        }
        catch (RemoteException | NotBoundException e){
             System.err.println(e.getMessage());
        }
        
         if (returnedData == 1){
                return true;
            } else {
                return false;
            }
    }
    
    public int EncendreLedGrup1() throws Exception{
        int returnedData = 5;
        try{
            registre = LocateRegistry.getRegistry(HOST, PORT);
            Api remoteApi = (Api) registre.lookup(Api.class.getSimpleName());

            returnedData = (remoteApi.EncendreLedGrup1(new Data(1)).getValor());
            System.out.println("EncendreLedGrup1:" + returnedData);

        }catch (RemoteException | NotBoundException e){
             System.err.println(e.getMessage());
        }
        return returnedData;
    }
    
     public int ApagarLedGrup1() throws Exception{
        int returnedData = 5;
        try{
            registre = LocateRegistry.getRegistry(HOST, PORT);
            Api remoteApi = (Api) registre.lookup(Api.class.getSimpleName());

            returnedData = (remoteApi.ApagarLedGrup1(new Data(1)).getValor());
            System.out.println("ApagarLedGrup1:" + returnedData);
            
        }catch (RemoteException | NotBoundException e){
             System.err.println(e.getMessage());
        }
        return returnedData;
    }
     
      public int EncendreLedGrup2() throws Exception{
        int returnedData = 5;
        try{
            registre = LocateRegistry.getRegistry(HOST, PORT);
            Api remoteApi = (Api) registre.lookup(Api.class.getSimpleName());

            returnedData = (remoteApi.EncendreLedGrup2(new Data(1)).getValor());
            System.out.println("EncendreLedGrup2:" + returnedData);
            
        }catch (RemoteException | NotBoundException e){
             System.err.println(e.getMessage());
        }
        
        return returnedData;
    }
    
     public int ApagarLedGrup2() throws Exception{
        int returnedData = 5;
        try{
            registre = LocateRegistry.getRegistry(HOST, PORT);
            Api remoteApi = (Api) registre.lookup(Api.class.getSimpleName());

            returnedData = (remoteApi.ApagarLedGrup2(new Data(1)).getValor());
            System.out.println("ApagarLedGrup2:" + returnedData);

        }catch (RemoteException | NotBoundException e){
             System.err.println(e.getMessage());
        }
        
        return returnedData;
    }
     
     public int EncendrePito() throws Exception{
        int returnedData = 5;
        try{
            registre = LocateRegistry.getRegistry(HOST, PORT);
            Api remoteApi = (Api) registre.lookup(Api.class.getSimpleName());

            returnedData = (remoteApi.EncendrePito(new Data(1)).getValor());
            System.out.println("EncendrePito:" + returnedData);

        }catch (RemoteException | NotBoundException e){
             System.err.println(e.getMessage());
        }
        
        return returnedData;
    }
     
    public int ApagarPito() throws Exception{
        int returnedData = 5;
        try{
            registre = LocateRegistry.getRegistry(HOST, PORT);
            Api remoteApi = (Api) registre.lookup(Api.class.getSimpleName());

            returnedData = (remoteApi.ApagarPito(new Data(1)).getValor());
            System.out.println("ApagarPito:" + returnedData);
            
        }catch (RemoteException | NotBoundException e){
             System.err.println(e.getMessage());
        }
        
        return returnedData;
    }

}
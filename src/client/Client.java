package client;

import api.Api;
import api.Data;
import java.rmi.registry.*;

/**
 * Classe que implementa un client RMI
 * Per implementar aquest codi en diferents màquines que necessita per crear 3 arxius jar:
 * api.jar: Api.java, Data.java 
 * server.jar: Server.java, ApiImpl.java 
 * client.jar: Client.java
 * En l'equip del servidor de la ruta de classe contindrà api.jar i server.jar 
 * En l'equip client de la ruta de classe contindrà api.jar i client.jar
 * @author sergi grau
 * @version 1.0 26.04.2013
 */
public class Client {
    public Client(){}
    
    private static final String HOST = "127.0.1.1"; //localhost
    private static final int PORT = 1080;
    private static Registry registre;

    
    public static boolean client() throws Exception {
        registre = LocateRegistry.getRegistry(HOST, PORT);
        Api remoteApi = (Api) registre.lookup(Api.class.getSimpleName());
        
        int returnedData = 0;
        returnedData = (remoteApi.Conectivitat(new Data(1)).getValor());
        System.out.println("Conectivitat:" + returnedData);
        
        if (returnedData == 1){
            return true;
        } else {
            return false;
        }
    }
    
    public void EncendreLedGrup1() throws Exception{
        registre = LocateRegistry.getRegistry(HOST, PORT);
        Api remoteApi = (Api) registre.lookup(Api.class.getSimpleName());
        registre = LocateRegistry.getRegistry(HOST, PORT);
        
        int returnedData = 0;
        returnedData = (remoteApi.EncendreLedGrup1(new Data(1)).getValor());
        System.out.println("EncendreLedGrup1:" + returnedData);
    }
    
     public void ApagarLedGrup1() throws Exception{
        registre = LocateRegistry.getRegistry(HOST, PORT);
        Api remoteApi = (Api) registre.lookup(Api.class.getSimpleName());
        registre = LocateRegistry.getRegistry(HOST, PORT);
        
        int returnedData = 0;
        returnedData = (remoteApi.ApagarLedGrup1(new Data(1)).getValor());
        System.out.println("ApagarLedGrup1:" + returnedData);
    }
     
      public void EncendreLedGrup2() throws Exception{
        registre = LocateRegistry.getRegistry(HOST, PORT);
        Api remoteApi = (Api) registre.lookup(Api.class.getSimpleName());
        registre = LocateRegistry.getRegistry(HOST, PORT);
        
        int returnedData = 0;
        returnedData = (remoteApi.EncendreLedGrup2(new Data(1)).getValor());
        System.out.println("EncendreLedGrup2:" + returnedData);
    }
    
     public void ApagarLedGrup2() throws Exception{
        registre = LocateRegistry.getRegistry(HOST, PORT);
        Api remoteApi = (Api) registre.lookup(Api.class.getSimpleName());
        registre = LocateRegistry.getRegistry(HOST, PORT);
        
        int returnedData = 0;
        returnedData = (remoteApi.ApagarLedGrup2(new Data(1)).getValor());
        System.out.println("ApagarLedGrup2:" + returnedData);
    }
     
     public void EncendrePito() throws Exception{
        registre = LocateRegistry.getRegistry(HOST, PORT);
        Api remoteApi = (Api) registre.lookup(Api.class.getSimpleName());
        registre = LocateRegistry.getRegistry(HOST, PORT);
        
        int returnedData = 0;
        returnedData = (remoteApi.EncendrePito(new Data(1)).getValor());
        System.out.println("EncendreLedGrup2:" + returnedData);
    }
     
    public void ApagarPito() throws Exception{
        registre = LocateRegistry.getRegistry(HOST, PORT);
        Api remoteApi = (Api) registre.lookup(Api.class.getSimpleName());
        registre = LocateRegistry.getRegistry(HOST, PORT);
        
        int returnedData = 0;
        returnedData = (remoteApi.ApagarPito(new Data(1)).getValor());
        System.out.println("EncendreLedGrup2:" + returnedData);
    }

}
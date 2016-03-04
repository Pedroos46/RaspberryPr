package api;

import java.rmi.*;
/**
 * Interficie para nuestro objeto remoto.
 * En nuestro caso se trata de nuna interficie que pasa objetos la cual enciende o apga leds, pitos, etc.
 */
public interface Api extends Remote {
    /**
     * @param objecte, el valor true o false
     * @throws RemoteException 
     */
    public Data Conectivitat(Data objecte) throws RemoteException;
    
    public Data EncendreLedGrup1(Data objecte) throws RemoteException;
    public Data ApagarLedGrup1(Data objecte) throws RemoteException;
    
    public Data EncendreLedGrup2(Data objecte) throws RemoteException;
    public Data ApagarLedGrup2(Data objecte) throws RemoteException;
    
    public Data EncendrePito(Data objecte) throws RemoteException;
    public Data ApagarPito(Data objecte) throws RemoteException;
    
    public Data LlegirLDR(Data objecte) throws RemoteException;
    public Data LlegirBoto(Data objecte) throws RemoteException;

}
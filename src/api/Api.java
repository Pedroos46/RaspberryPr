package api;

import java.rmi.*;
/**
 * la interfície per al nostre objecte remot. 
 * En el nostre cas es tracta d'una senzilla interfície per incrementar un comptador compartit.
 * a nostra interfície implementa java.rmi.Remote per marcar la interfície com a disponible de forma remota. 
 * Així mateix, la interfície utilitza una classe de dades per emmagatzemar les dades. 
 * @author sergi grau
 * @version 1.0 26.04.2013
 */
public interface Api extends Remote {
    /**
     * comptador. Rep un objecte Data que encapsula un nombre enter
     * @param objecte, el valor amb l'enter a incremetar
     * @return retorna el objecte amb el valor incrementat
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
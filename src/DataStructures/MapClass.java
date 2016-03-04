/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *Clase contenedora de las variables que recibe del XML.
 * Esta clase guarda las variables que recibe y luego las pasa a variables generales (contadores)
 * 
 */
public class MapClass {
    public MapClass(){}
    
    static HashMap<String, Integer> map = new HashMap<String, Integer>();
    
    public void put(String i, Integer e){
        /**Metodo para demostrar el almacenamiento de datos*/
        map.put(i, new Integer(e));
        System.out.print("Put fet  " + i + " " + e + "\n" );
        System.out.println(map.toString());
        System.out.println("\n");
    }
    
    public int getData(String i){
        /**Metodo para demostrar la recogida de datos*/
        System.out.println("\n");
        System.out.print(map.toString() + "S'ha agafat el valor de" + i + " del Map.\n");
        return(map.get(i).intValue());
        
    }
    
    public boolean isEmpty(){
        /**Metodo para demostrar si esta vacia*/
        return(map.isEmpty());
    }
}

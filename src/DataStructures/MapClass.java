/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Roger
 */
public class MapClass {
    public MapClass(){}
    
    Map<String, Integer> map = new HashMap<String, Integer>();
    
    public void put(String i, Integer e){
        map.put(i, e);
        System.out.print("Put fet " + i + " " + e + "\n" );
    }
    
    public int getData(String i){
        return(map.get(i).intValue());
    }
    
    public boolean isEmpty(){
        return(map.isEmpty());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

import java.util.ArrayList;

/**
 *
 * @author Roger
 */
public class ArrayListClass {
    public ArrayListClass(){}
    
    static ArrayList<Integer> array = new ArrayList<Integer>();
    
    StackClass stack = new StackClass();
    MapClass mapout = new MapClass();
 
public int getData(int i){
    return(array.get(i));
}
      
public void cargaArrayList() throws Exception {
    System.out.print("\nPASANT A ARRAYLIST");
    
    //STACK
    if(stack.mida() < 0){
        System.out.print("No hi ha res al Stack\n");
    }else {
        try{                
            array.add(stack.getTop());
            array.add(stack.getTop());
            array.add(stack.getTop());

            
        } catch (Exception e) {
        System.err.println(e.getMessage());
        } 
    }
        
    //MAP
    Thread.sleep(500);
    if(mapout.isEmpty() == true){
        System.out.print("No hi ha res al Map\n");
    }else {
        try{
            array.add(mapout.getData("Pito"));
            array.add(mapout.getData("Boto"));
            array.add(mapout.getData("Servo"));


        } catch (Exception e) {
            System.err.println(e.getMessage());
            } 
        }
    }
}

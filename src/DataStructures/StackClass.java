/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

import java.util.Stack;

/**
 *Clase contenedora de las variables que recibe del XML.
 * Esta clase guarda las variables que recibe y luego las pasa a variables generales (contadores)
 * 
 */
public class StackClass {
    public StackClass(){
    }
    
    static Stack<Integer> stack = new Stack<Integer>();
  
    public void push(Integer i){
        /**Metodo para demostrar el almacenamiento de datos*/
        stack.push(i);
        System.out.println("Push fet." + i);
        System.out.print((stack).toString());
        System.out.println("\n");

    }
    
    public int mida(){
        /**Metodo para demostrar el tamaño*/
        int size = stack.size() -1;
        return(size);
    }
    public Integer getTop(){
        /**Metodo para demostrar la recogida de datos*/
        System.out.println("\n");
        System.out.print(stack.toString() +"S'ha agafat el primer del Stack.\n");
        return(stack.pop());
    }
    
}


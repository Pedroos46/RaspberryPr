/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

import java.util.Stack;

/**
 *
 * @author Roger
 */
public class StackClass {
    public StackClass(){
    }
    
    static Stack<Integer> stack = new Stack<Integer>();
  
    public void push(Integer i){
        stack.push(i);
        System.out.println("Push fet." + i);
        System.out.print((stack).toString());
    }
    
    public boolean isEmpty(){
        return(stack.isEmpty());
    }
    
    public int mida(){
        int size = stack.size() -1;
        return(size);
    }
    
    /*public int peek(){
        return (stack.peek());
    }    */
    public Integer getTop(){
        System.out.print(stack.toString());
        System.out.println("S'ha agafat el primer del Stack.");
        Integer a = stack.pop();
        return(a);
    }
    
}


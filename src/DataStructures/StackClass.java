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
    
    Stack<String> stack = new Stack<>();
  
    public void push(String i){
        stack.push(i);
        System.out.println("Push fet." + i);
    }
    
    public void pop(){
        stack.pop();
        System.out.println("Pop fet.");
    }
    
    public boolean isEmpty(){
        return(stack.isEmpty());
    }
    
    public String peek(){
        return (stack.peek());
    }
    
    public String getTop(){
        System.out.print(stack);
        System.out.println("S'ha agafat el primer del Stack.");
        return(stack.peek());
    }
    
}


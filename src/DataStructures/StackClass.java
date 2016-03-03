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
    
    Stack<Integer> stack = new Stack<>();
  
    public void push(Int i){
        stack.push(new Integer(i));
        System.out.println("Push fet." + i);
    }
    
    public void pop(){
        stack.pop();
        System.out.println("Pop fet.");
    }
    
    public boolean isEmpty(){
        return(stack.isEmpty());
    }
    
    public int peek(){
        return (stack.peek());
    }
    
    public int getTop(){
        System.out.print(stack);
        System.out.println("S'ha agafat el primer del Stack.");
        return(stack.peek());
    }
    
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InternalClass;

/**
 *
 * @author Roger
 */
public class OuterClass {
    private class Inner{
        
        public void print(){	   
        System.out.println("Hola, soc una clase interna :)");
        
        }
   }
   //Accessing he inner class from the method within
    public void cridarInner(){
      Inner inner = new Inner();
      inner.print();
   }
}


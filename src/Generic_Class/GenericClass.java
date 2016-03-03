/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generic_Class;

import java.util.ArrayList;


public class GenericClass <T,E> {
    
    private T nombrecolecion;
    
    ArrayList<E> lista= new ArrayList<E>();

    public GenericClass(T nombrecolecion) {
        this.nombrecolecion = nombrecolecion;
    }
    
    
    public T obtenirNombreColecion(){
        return nombrecolecion;
    }
    
    public ArrayList obtenirColeciones(){
        return lista;
    }
    
    public void afegirColeciones(E e){
       lista.add((E) e);
   }
    
}

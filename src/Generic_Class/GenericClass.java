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
    
    public int obtenirSize(){
        return lista.size();   
    }
    
    public ArrayList obtenirColeciones(){
        return lista;
    }
    
    public void afegirColeciones(E e){
       lista.add((E) e);
   }
    
 public String toString(){
        return "ClasseGenerica amb tamany "+obtenirSize()+" i nom "+ obtenirNombreColecion();
    }
     
    public int compare(GenericClass o1, GenericClass o2) {
        if (o1.obtenirSize() == o2.obtenirSize()){
         return 0;
        
        }else{  if (o1.obtenirSize() > o2.obtenirSize()){
               return 1;
        }else  if (o1.obtenirSize() < o2.obtenirSize()){
        
               return -1;
        }return 0;
        } 
    }
}

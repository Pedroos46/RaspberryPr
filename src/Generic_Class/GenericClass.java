/**
 * Clase Generica donde guardamos Estructuras de datos y las guardamos en txt.
 * Esta clase sirve para hacer una coleccion de estructuras y ordenarlas para luego guardarlas en un txt
 * usando la clase comparator.
*/
package Generic_Class;

import java.util.ArrayList;


public class GenericClass <T,E> {
    
    private T nombrecolecion;
    
    ArrayList<E> lista= new ArrayList<E>();

    public GenericClass(T nombrecolecion) {
        /**Metodo para guardar el nombre de la colecion*/
        this.nombrecolecion = nombrecolecion;
    }
    
    
    public T obtenirNombreColecion(){
       /**Metodo que devuelve el nombre de la colecion*/
        return nombrecolecion;
    }
    
    public int obtenirSize(){
        /**Metodo que devuelve el size de la colecion*/
        return lista.size();   
    }
    
    public ArrayList obtenirColeciones(){
        /**Metodo que devuelve la colecion*/
        return lista;
    }
    
    public void afegirColeciones(E e){
      /**Metodo para añadir datos a la colecion*/
        lista.add((E) e);
   }
    
 public String toString(){
     /**Metodo para devolver un string para printarlo*/   
     return "ClasseGenerica amb tamany "+obtenirSize()+" i nom "+ obtenirNombreColecion();
    }
     
    public int compare(GenericClass o1, GenericClass o2) {
        /**Metodo de comparacion por tamaño*/
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

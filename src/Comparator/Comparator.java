/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparator;


import Generic_Class.GenericClass;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.List;

/**
 *
 * @author aleix
 */
public class Comparator {
    

public void EscriuTxT() throws IOException {

    GenericClass a =new GenericClass("A");
    GenericClass b =new GenericClass("B");
    GenericClass c =new GenericClass("C");
    
    a.afegirColeciones("qwwdwewefefesfseffsed");
    a.afegirColeciones("qwwdweweeffewd");
    b.afegirColeciones("qwwdweweeffewd");
    c.afegirColeciones("qwwdd");
    
    List<GenericClass> datos = new ArrayList();
    datos.add(b);
    datos.add(c);
    datos.add(a);
   
    datos.add(new GenericClass("joseewweff"));

    //Collections.sort(datos,new GenericClass("dv"));
    System.out.print(datos);
    FileWriter fw = new FileWriter("sortida.txt");
    fw.close();
    
    }
}
    
    
    

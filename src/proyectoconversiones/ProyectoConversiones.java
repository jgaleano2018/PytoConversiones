/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoconversiones;

//import java.util.Iterator;
//import java.lang.*;
//import java.util.*;


import java.util.Iterator;
import java.lang.Iterable;
import java.util.NoSuchElementException;
import java.lang.IndexOutOfBoundsException;

/**
 *
 * @author Jose Mauricio
 */
public class ProyectoConversiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Branch
        ListaSimpleNumeros lista = new ListaSimpleNumeros();
        
        System.out.println("Ejemplo de lista simple...");
        
        Object obj;
        
        for (int i = 0; i<=10; i++)
        {
            lista.agregarAlInicio(String.valueOf(i));            
            //String.valueOf(i);
        }
        
        lista.listar();
        
        //Branch punto 2
        //Convierto la lista simple "ListaSimpleNumeros" en una Generic List "ListaGeneric":
        
        ListaGeneric listaGeneric = new ListaGeneric();
        
        for (int i = 0; i<=10; i++)
        {
            listaGeneric.agregarAlInicio(String.valueOf(i));            
            //String.valueOf(i);
        }
        
        listaGeneric.listar();

        //Branch punto 3
               
        NodoGeneric NodoG = new NodoGeneric();
        MyIterable myIterable = new MyIterable(NodoG);        
        
        for (Object s: myIterable){
            System.out.println(s);
        }
        
        
    }
    
}

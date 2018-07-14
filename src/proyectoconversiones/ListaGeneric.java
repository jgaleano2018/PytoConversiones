/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoconversiones;

/**
 *
 * @author Jose Mauricio
 */
public class ListaGeneric<T> {
    
    private NodoGeneric inicio;
    
    private int tamanio;

    public void ListaSimpleNumeros(){
        inicio = null;
        tamanio = 0;
    }
    
    public boolean esVacia(){
        return inicio == null;
    }
    /*add new node to the list top*/
    
    public void agregarAlInicio(T obj){
    
        NodoGeneric nuevo = new NodoGeneric();
        
        nuevo.setValor(obj);
        
        if (esVacia()){
            inicio = nuevo;
        } else {
            
            NodoGeneric aux = inicio;
            
            while(aux.getSiguiente()!= null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tamanio++;
    }
    
    /*it find if exists the value into the list*/    
    public boolean buscar(T referencia){
        
        NodoGeneric aux = inicio;
        
        boolean encontrado = false;
        
        while (aux != null && encontrado != true){
            
            if (referencia == aux.getValor()){
                
                encontrado = true;
                
            } else {
                aux = aux.getSiguiente();
            }
        }
        return encontrado;
    }
    
    public void listar(){
    
        if (!esVacia()){
            
            NodoGeneric aux = inicio;
            
            int i = 0;
            
            while (aux != null){
            
                System.out.print(i + ".[ " + aux.getValor() + " ]" + " -> ");
                
                aux = aux.getSiguiente();
                
                i++;
            }
        }
    }
}

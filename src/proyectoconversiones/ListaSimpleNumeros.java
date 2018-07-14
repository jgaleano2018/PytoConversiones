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
public class ListaSimpleNumeros {
    
    private Nodo inicio;
    
    private int tamanio;

    public void ListaSimpleNumeros(){
        inicio = null;
        tamanio = 0;
    }
    
    public boolean esVacia(){
        return inicio == null;
    }
    /*add new node to the list top*/
    
    public void agregarAlInicio(Object obj){
    
        Nodo nuevo = new Nodo();
        
        if (obj instanceof String)
        {
            throw new IllegalArgumentException("El valor del tipo de dato esperado es Int.");
        }
        
        int valorint = Integer.parseInt((String) obj);
            
        nuevo.setValor(valorint);
        
        if (esVacia()){
            inicio = nuevo;
        } else {
            
            Nodo aux = inicio;
            
            while(aux.getSiguiente()!= null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tamanio++;
    }
    
    /*it find if exists the value into the list*/    
    public boolean buscar(Object referencia){
        
        Nodo aux = inicio;
        
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
            
            Nodo aux = inicio;
            
            int i = 0;
            
            while (aux != null){
            
                System.out.print(i + ".[ " + aux.getValor() + " ]" + " -> ");
                
                aux = aux.getSiguiente();
                
                i++;
            }
        }
    }
}

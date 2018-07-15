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
public class NodoGeneric<T> {
    
    private T valor;

    private NodoGeneric siguiente;
    
    public void NodoGeneric(){
        //this.valor = 0;        
        this.siguiente = null;        
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public NodoGeneric getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoGeneric siguiente) {
        this.siguiente = siguiente;
    }
    
}

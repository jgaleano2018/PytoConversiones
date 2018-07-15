/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoconversiones;


import java.util.Iterator;
import java.lang.Iterable;
import java.util.NoSuchElementException;
import java.lang.IndexOutOfBoundsException;


/**
 *
 * @author Jose Mauricio
 */
    
public class MyIterator<T> implements Iterator<T> {

        NodoGeneric<T> last, current;

        public MyIterator(NodoGeneric start){
            current = start;
        }

        @Override
        public boolean hasNext() {
            if (current.getSiguiente() == null) return false;
            return true;
        }

        @Override
        public T next() throws NoSuchElementException{
            if (current.getSiguiente() == null) throw new NoSuchElementException();
            last = current;
            current = last.getSiguiente();
            return last.getValor();
        }

        /*@Override
        public void remove() throws IllegalStateException{
            if (last==null) throw new IllegalStateException();
            current = last.getSiguiente() = current.getSiguiente();
        }*/

}
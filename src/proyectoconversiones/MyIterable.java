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
import java.util.Collections;
import java.util.List;


/**
 *
 * @author Jose Mauricio
 */
public class MyIterable<T> implements Iterable<T> {

    NodoGeneric<T> last, current;

        public MyIterable(NodoGeneric start){
            current = start;
        }
   
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                if (current.getSiguiente() == null) return false;
                return true;
            }

            @Override
            public T next() {
                if (current.getSiguiente() == null) throw new NoSuchElementException();
                last = current;
                current = last.getSiguiente();
                return last.getValor();
            }

            @Override
            public void remove() {  
                throw new UnsupportedOperationException();
            }
        };
    }

}


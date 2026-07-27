package ar.edu.uns.cs.ed.tdas.tps.tp4.ej1;

import ar.edu.uns.cs.ed.tdas.excepciones.BoundaryViolationException;
import ar.edu.uns.cs.ed.tdas.excepciones.EmptyListException;
import ar.edu.uns.cs.ed.tdas.excepciones.InvalidPositionException;
import ar.edu.uns.cs.ed.tdas.tdalista.PositionList;
import ar.edu.uns.cs.ed.tdas.Position;

import java.util.Iterator;

public class ListaDobleEnlazadaCentinela<E> implements PositionList<E>{
   // Atributos de instancia
   protected DNodo<E> header;
   protected DNodo<E> trailer;
   protected int tamanio;
   // Constructores
   public ListaDobleEnlazadaCentinela(){
        header = new DNodo<E>(null);
        trailer = new DNodo<E>(null);
        header.setSiguiente(trailer);
        trailer.setAnterior(header);
        tamanio = 0;
    }
   // Métodos
   public int size(){
        return tamanio;
    }
   
   public boolean isEmpty(){
        return tamanio == 0;
    }
   
   public Position<E> first() throws EmptyListException{
        if (isEmpty()) throw new EmptyListException("Lista vacía");
        return header.getSiguiente();
    }
   
   public Position<E> last(){
        if (isEmpty()) throw new EmptyListException("Lista vacía");
        return trailer.getAnterior();
    }
}

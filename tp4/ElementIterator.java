package ar.edu.uns.cs.ed.tdas.tps.tp4.ej1;

import ar.edu.uns.cs.ed.tdas.tdalista.PositionList;
import ar.edu.uns.cs.ed.tdas.Position;

import java.util.*;
public class ElementIterator<E> implements Iterator <E> {
    // Atributos de instancia
    protected PositionList<E> lista; // Lista a iterar
    protected Position<E> cursor; // Posición del elemento corriente
    // Constructores
    public ElementIterator (PositionList <E> l ) {
        lista = l; // Guardo la lista a iterar
        if (lista.isEmpty()) cursor = null; // Si la lista está vacía, la posición corriente es nula
        else cursor = lista.first(); // Sino la posición corriente es la primera de la lista
    }
    // Devuelve true si hay algún elemento más para ver.
    // Hay siguiente si el cursor no está más allá de la última posición
    public boolean hasNext() { return cursor != null; }
}

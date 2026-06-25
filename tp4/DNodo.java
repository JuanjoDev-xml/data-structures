package ar.edu.uns.cs.ed.tdas.tps.tp4.ej1;
import ar.edu.uns.cs.ed.tdas.Position;


public class DNodo<E> implements Position<E>{
    // Atributos de instancia
    protected E elemento;
    protected DNodo<E> siguiente;
    protected DNodo<E> anterior;
    // Constructores
    public DNodo(E item, DNodo<E> sig, DNodo<E> ant){
        elemento = item;
        siguiente = sig;
        anterior = ant;
    }
    public DNodo(E item){this(item, null, null);}
}

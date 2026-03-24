package ej4;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class ColaEnteros {
    public int mayorValor(Queue<Integer> q){
        q = new LinkedList<Integer>();
        int mayor = -9999;
        int frente;
        int tamanio = q.size();
        for (int i = 0; i < tamanio; i++){
            frente = q.remove();
            if (mayor < frente)
                mayor = frente;
            q.add(frente);
        }
        return mayor;
    }
}

package ej2;
import java.util.Queue;
import java.util.LinkedList;

public class ArregloEnteros {
    protected int [] arr;
    protected int cant;

    public ArregloEnteros(int n){
        arr = new int[n];
        cant = 0;
    }

    public void insertar(int n){
        arr[cant] = n;
        cant++;
    }

    public Queue<Integer> impares(Queue<Integer> c){
        
    }
}

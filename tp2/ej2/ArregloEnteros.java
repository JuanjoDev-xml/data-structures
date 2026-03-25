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
        Queue<Integer> imp = new LinkedList<Integer>();
        int num = 0;
        for (int i = 0; i < c.size(); i++){
            num = c.remove();
            if (num % 2 != 0)
                imp.add(num);
        }
        return imp;
    }
}

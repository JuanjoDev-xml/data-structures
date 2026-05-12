package ej1;
import java.util.Stack;

public class ArregloPersonas {
    private Persona [] arr;
    private int cant;

    public ArregloPersonas(int n){
        arr = new Persona[n];
        cant = 0;
    }

    public void insertarPersona(Persona p){
        arr[cant] = p;
        cant++;
    }
    public void cambiarPersona(Persona p, int i){
        arr[i] = p;        
    }
    public void imprimir(){
        for (int i = 0; i < cant; i++){
            arr[i].toString();
        }
    }

    public Persona obtenerPersona(int i){
        return arr[i];
    }

    public void invertir(ArregloPersonas a){
        Stack<Persona> pilaPers = new Stack<Persona>();
        for (int i = a.cant - 1; i >= 0; i++){
            pilaPers.push(a.obtenerPersona(i));
        }
        for (int i = a.cant - 1; i >= 0; i++){
            a.cambiarPersona(pilaPers.pop(), i);
        }
    }
}

import java.util.Stack;
import java.util.EmptyStackException;

public class ArregloPersonas {
    private Persona [] arr;
    private int cant;

    public ArregloPersonas(int n){
        arr = new Persona[n];
        cant = 0;
    }

    public void insertarPersona(Persona p){
        boolean listo = false;
        for (int i = 0; i < arr.length && !listo; i++){
            if (arr[i] == null){
                arr[i] = p;
                listo = true;
            }
        }
    }

    public void imprimir(){
        for (int i = 0; i < cant; i++){
            arr[i].toString();
        }
    }
}

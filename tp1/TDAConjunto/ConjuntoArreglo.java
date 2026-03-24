public class ConjuntoArreglo<E> implements Conjunto<E> {
    private E [] array;
    private int cant;

    public ConjuntoArreglo(int n){
        array = (E[]) new Object[n];
        cant = 0;
    }

    public int size(){
        return cant;
    }
    public int capacity(){
        return array.length;
    }
    public boolean isEmpty(){
        return cant == 0;
    }
    public E get(int i){
        // Requiere i valido
        return array[i];
    }
    public void put(E elem){
        // Requiere conjunto no lleno
        // Requiere que el elemento no este en el conjunto
        // ???? qué comparación por equivalencia, si requiere que el elem no esté
        boolean listo = false;
        for (int i = 0; i < array.length && !listo; i++){
            if (array[i] == null){
                array[i] = elem;
                listo = true;
            }
        }
        cant++;
    }
    public boolean pertenece(E elem){
        boolean res = false;
        for (int i = 0; i < array.length && !res; i++){
            if (array[i] != null && array[i].equals(elem))
                res = true;
        }
        return res;
    }
    // está bien?
    public Conjunto<E> interseccion(Conjunto<E> c){
        ConjuntoArreglo<E> inter = new ConjuntoArreglo<E>(cant);
        for (int i = 0; i < array.length; i++){
            if (array[i] != null && c.pertenece(array[i]))
                inter.put(array[i]);
        }
        return inter;
    }
    public void print(){
        for (int i = 0; i < array.length; i++){
            if (array[i] != null)
                System.out.print(array[i] + " ");
        }
    }
}

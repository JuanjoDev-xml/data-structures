import java.util.Stack;
public class ColaConPila<E> implements Queue<E>{
    protected Stack<E> pila = new Stack<E>();

    public int size(){
        return pila.size(); 
    }
    public boolean isEmpty(){
        return pila.isEmpty();
    }
    public E front(){
        // ?
    }
    public void enqueue(E element){
        pila.add(element); // ?????
    }
    public E dequeue(){
        // ??????
    }
}
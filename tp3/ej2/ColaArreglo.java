public class ColaArreglo<E> implements Queue<E>{
    protected int f;
    protected int r;
    protected int tamanio;
    protected E [] q;

    public ColaArreglo(int t){
        f = 0;
        r = 0;
        tamanio = 0;
    }

    public boolean isEmpty(){
        return tamanio == 0;
        // antes: f == r
    }
    public E front() throws EmptyQueueException{
        if (isEmpty()){
            throw new EmptyQueueException("Cola vacía");
        }
        return q[f];
    }
    public int size(){
        return tamanio;
    }
    public void enqueue(E element) throws FullQueueException{
        if (size() == tamanio){
            throw new FullQueueException("Cola llena");
        }
        q[r] = element;
        r = (r+1) % (tamanio+1);
        // por qué no simplemente r++ ??????
    }
    public E dequeue() throws EmptyQueueException{
        if (isEmpty()){
            throw new EmptyQueueException("Cola vacía");
        }
        E res = q[f];
        q[f] = null;
        f = (f+1) / (tamanio+1); // ??????????????????????
        return res;
    }
}
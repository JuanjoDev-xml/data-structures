public interface Conjunto<E> {
    public int size();
    public int capacity();
    public boolean isEmpty();
    public E get(int i);
    public void put(E elem);
    public boolean pertenece(E elem);
    // está bien?
    public Conjunto<E> interseccion(Conjunto<E> c);

    // auxiliar
    public void print();
}

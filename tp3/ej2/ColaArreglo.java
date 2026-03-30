public class ColaArreglo implements Queue{
    protected int f;
    protected int r;
    protected int tamanio;

    public ColaArreglo(int t){
        f = 0;
        r = 0;
        tamanio = 0;
    }

    public boolean isEmpty(){
        return tamanio == 0;
        // antes: f == r
    }
    
}
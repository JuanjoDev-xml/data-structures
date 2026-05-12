public class EmptyStackException extends RuntimeException{
    public EmptyStackException (String m){
        super(m);
    }
}

// Se heredan: getMessage(), printStackTrace()
package ej3;

import java.util.Stack;

public class PilasGenericas<E> {

    private int mayorSize(Stack<E> p1, Stack<E>p2){
        if (p1.size() > p2.size())
            return p1.size();
        return p2.size();
    }
    public Stack<E> intercalar(Stack<E> p1, Stack<E>p2){
        Stack<E> res = new Stack<E>();
        int suma = mayorSize(p1, p2);
        for (int i = 0; i < suma; i++){
            if (!p1.empty()){
                res.push(p1.pop());
            }
            if (!p2.empty()){
                res.push(p2.pop());
            }
        }
        return res;
    }
}

package ej3;

import java.util.Stack;

public class PilasGenericas<E> {

    public Stack<E> intercalar(Stack<E> p1, Stack<E>p2){
        Stack<E> res = new Stack<E>();
        int suma = p1.size() + p2.size();
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

package ej3;

import java.util.Stack;

public class PilasGenericas<E> {

    public Stack<E> intercalar(Stack<E> p1, Stack<E>p2){
        Stack<E> res = new Stack<E>();
        for (int i = 0; i < p1.size() + p2.size(); i++){
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

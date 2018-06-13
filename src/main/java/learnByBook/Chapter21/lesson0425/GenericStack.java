package learnByBook.Chapter21.lesson0425;

import java.util.ArrayList;

/**
 * Created by xin14.zhang on 2018/4/25.
 */
public class GenericStack<E> {
    private ArrayList<E> list = new ArrayList<E>();
    public int getSize(){
        return list.size();
    }
    public E peek(){
        return list.get(getSize()-1);
    }
    public void push(E o){
        list.add(o);
    }
    public E pop(){
        E o = list.get(getSize()-1);
        list.remove(getSize()-1);
        return o;
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }

}

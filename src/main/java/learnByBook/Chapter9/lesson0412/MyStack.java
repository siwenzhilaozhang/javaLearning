package learnByBook.Chapter9.lesson0412;

import java.util.ArrayList;

/**
 * Created by xin14.zhang on 2018/4/12.
 */
public class MyStack {
    private ArrayList list = new ArrayList();
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public int getSize(){
        return list.size();
    }
    public Object peek(){
        return list.get(getSize()-1);
    }
    public Object pop(){
        Object o = list.get(getSize()-1);
        list.remove(getSize()-1);
        return o;
    }
    public Object push(Object o){
        list.add(o);
        return o;
    }
    public int search(Object o){
        return list.lastIndexOf(o);
    }
    public String toString(){
        return "stack: "+list.toString();
    }
}

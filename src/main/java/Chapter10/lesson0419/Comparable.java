package Chapter10.lesson0419;

/**
 * Created by xin14.zhang on 2018/4/19.
 */
public interface Comparable {
    public int compareTo(Object o);
}

public class Max{
    public static Comparable max(Comparable o1,Comparable o2){
        if(o1.compareTo(o2)>0)
            return o1;
        else return o2;
    }
}
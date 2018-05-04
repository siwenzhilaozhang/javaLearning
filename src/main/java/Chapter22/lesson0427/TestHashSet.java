package Chapter22.lesson0427;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by xin14.zhang on 2018/4/27.
 */
public class TestHashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");
        System.out.println(set);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next().toUpperCase()+" ");
        }
    }
}

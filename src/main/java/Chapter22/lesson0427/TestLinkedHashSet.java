package Chapter22.lesson0427;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by xin14.zhang on 2018/4/27.
 */
public class TestLinkedHashSet {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>();
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");
        System.out.println(set);
        for (Object element:set)
            System.out.print(element.toString().toLowerCase()+" ");
    }
}

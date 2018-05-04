package Chapter22.lesson0428;

import Chapter9.lesson0411.Circle;
import Chapter9.lesson0411.GeometricObject;
import Chapter9.lesson0411.Rectangle;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by xin14.zhang on 2018/4/28.
 */
public class TestTreeSetWithComparator {
    public static void main(String[] args) {
        Set<GeometricObject> set = new TreeSet<GeometricObject>(new GeometricObjectComparator());
        set.add(new Rectangle(4,5));
        set.add(new Circle(40));
        set.add(new Circle(40));
        set.add(new Rectangle(4,1));
        System.out.println("A sorted set of geometric objects");
        for (GeometricObject element:set) System.out.println("area = "+element.getArea());
    }
}

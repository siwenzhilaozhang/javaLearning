package learnByBook.Chapter21.lesson0426;

import learnByBook.Chapter9.lesson0411.Circle;
import learnByBook.Chapter9.lesson0411.GeometricObject;
import learnByBook.Chapter9.lesson0411.Rectangle;

/**
 * Created by xin14.zhang on 2018/4/26.
 */
public class BoundedTypeDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,2);
        Circle circle = new Circle(2);
        System.out.println("Same area? "+BoundedTypeDemo.<GeometricObject>equalArea(rectangle,circle));
    }
    public static <E extends GeometricObject> boolean equalArea(E object1,E object2){
        return object1.getArea() == object2.getArea();
    }
}

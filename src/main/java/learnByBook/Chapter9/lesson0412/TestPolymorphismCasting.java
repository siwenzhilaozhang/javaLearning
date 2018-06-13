package learnByBook.Chapter9.lesson0412;

import learnByBook.Chapter9.lesson0411.Circle;
import learnByBook.Chapter9.lesson0411.Rectangle;

/**
 * Created by xin14.zhang on 2018/4/12.
 */
public class TestPolymorphismCasting {
    public static void main(String[] args) {
        Object object1 = new Circle(1);
        Object object2 = new Rectangle(1,1);
        displayObject(object1);
        displayObject(object2);
    }
    public static void displayObject(Object object){
        if(object instanceof Circle){
            System.out.println("The circle area is "+((Circle)object).getArea());
            System.out.println("The circle diameter is "+((Circle)object).getDiameter());
        }
        else if(object instanceof Rectangle){
            System.out.println("The rectangle area is "+((Rectangle)object).getArea());
        }
    }
}

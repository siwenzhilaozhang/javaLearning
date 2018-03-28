package Chapter7.lesson0319;

import Chapter7.Circle3;
import javafx.scene.shape.Circle;

/**
 * Created by xin14.zhang on 2018/3/19.
 */
public class L710 {
    public static void main(String[] args){
        Circle3 myCircle = new Circle3(5.0);
        printCircle(myCircle);

        int n =5;
        printAreas(myCircle,n);
        System.out.println("\n"+"Radius is "+myCircle.getRadius());
        System.out.println("\n is "+n);
    }
    public static void printCircle(Circle3 c){
        System.out.println("The area of the circle of radius "+c.getRadius() +" is "+c.getArea());
    }
    public static void printAreas(Circle3 c, int times){
        System.out.println("Radius \t\tArea");
        while(times>=1){
            System.out.println(c.getRadius()+"\t\t"+c.getArea());
            c.setRadius(c.getRadius()+1);
            times--;
        }
    }
}

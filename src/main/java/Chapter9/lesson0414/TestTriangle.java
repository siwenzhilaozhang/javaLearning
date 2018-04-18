package Chapter9.lesson0414;

/**
 * Created by xin14.zhang on 2018/4/14.
 */
public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1,1.5,1);
        triangle.setColor("yellow");
        triangle.setFilled(true);
        System.out.println("The Area is "+triangle.getArea());
        System.out.println("The Perimeter is "+triangle.getPerimeter());
        System.out.println("The color is "+triangle.getColor());
        System.out.println("The isFilled is "+triangle.isFilled());
        System.out.println(triangle.toString());
    }
}

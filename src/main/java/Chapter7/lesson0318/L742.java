package Chapter7.lesson0318;

/**
 * Created by xin14.zhang on 2018/3/18.
 */
public class L742 {
    public static void main(String[] args) {
        L742 myCircle = new L742(5.0);
        System.out.println("The area of the circle of radius "+myCircle.radius+" is "+myCircle.getArea());
        L742 yourCircle = new L742();
        System.out.println("The area of the circle of radius "+yourCircle.radius+" is "+yourCircle.getArea());
        yourCircle.radius=100;
        System.out.println("The area of the circle of radius "+yourCircle.radius+" is "+yourCircle.getArea());
    }
    double radius;
    L742(){radius= 1.0; }
    L742(double newRadius){radius=newRadius;}
    double getArea(){return radius*radius*Math.PI;}

}

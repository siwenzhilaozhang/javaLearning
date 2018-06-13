package learnByBook.Chapter7.lesson0319;

/**
 * Created by xin14.zhang on 2018/3/19.
 */
public class L708 {
    private double radius =1;
    private static int numberOfObjects = 0;
    public L708(){
        numberOfObjects++;
    }
    public L708(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }
    public double getRadius(){
        return radius;
    }
    public  void setRadius(double newRadius){
        radius = (newRadius>=0)?newRadius:0;
    }
    public static int getNumberOfObjects(){
        return numberOfObjects;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }

}

class TestCircle3{
    public static void main(String[] args){
        L708 myCircle = new L708(5.0);
        System.out.println("The area of the circle of radius "+myCircle.getRadius()+" is "+myCircle.getArea());
        myCircle.setRadius(myCircle.getRadius()*1.1);
        System.out.println("The area of the circle of radius "+myCircle.getRadius()+" is "+myCircle.getArea());
    }
}

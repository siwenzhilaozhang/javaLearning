package learnByBook.Chapter7.lesson0319;

/**
 * Created by xin14.zhang on 2018/3/19.
 */
public class L712 {
    int i = 5;
    static double k = 0;
    void setI(int i){
        this.i = i;
    }
    static void setK(double k){
        L712.k=k;
    }
}
class Circle{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(){
        this(1.0);
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
}

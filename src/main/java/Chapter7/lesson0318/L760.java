package Chapter7.lesson0318;

/**
 * Created by xin14.zhang on 2018/3/18.
 */
public class L760 {
    double radius;
    static int numberOfObjects =0;
    L760(){
        radius = 1.0;
        numberOfObjects++;
    }
    L760(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }
    static int getNumberOfObjects(){
        return numberOfObjects;
    }
    double getArea(){
        return radius*radius*Math.PI;
    }
}



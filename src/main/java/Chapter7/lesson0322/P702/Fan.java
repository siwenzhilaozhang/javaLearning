package Chapter7.lesson0322.P702;

import static java.awt.Color.blue;

/**
 * Created by xin14.zhang on 2018/3/22.
 */
public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FASH = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
//    public Fan(){
//        this(SLOW,false,5,blue);
//    }
    public Fan(){
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public boolean getOn(){
        return on;
    }
    public void setOn(boolean on){
        this.on = on;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public static toString(){

    }
}

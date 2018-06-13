package learnByBook.Chapter7.lesson0322.P702;

import static java.awt.Color.blue;

/**
 * Created by xin14.zhang on 2018/3/22.
 */
public class Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FASH = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    public Fan(){
        this(SLOW,5,"blue",false);
    }
    public Fan(int speed,double radius,String color,boolean on){
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.on = on;
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

   public void toString(boolean on){
       String output = "The speed of Fan is"+speed+",the color of Fan is"+color+
               ",the radius of the Fan is "+radius;
       if(on = true)System.out.println(output);
       else System.out.println("fan is off ,"+output);
   }
}

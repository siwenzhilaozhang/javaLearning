package learnByBook.Chapter7.lesson0321.P701;

/**
 * Created by xin14.zhang on 2018/3/21.
 */
public class Rectangle {
    private double width;
    private double heigh;
    private String color = "whight";
    public Rectangle(){
        this(1,1);
    }
    public Rectangle(double width,double heigh){
        this.width = width;
        this.heigh = heigh;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getHeigh(){
        return heigh;
    }
    public void setHeigh(double heigh){
        this.heigh = heigh;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public double getArea(){
        return width*heigh;
    }
    public double getPerimeter(){
        return width+heigh;
    }
}

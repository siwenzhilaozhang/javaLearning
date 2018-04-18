package Chapter9.lesson0411;

/**
 * Created by xin14.zhang on 2018/4/11.
 */
public abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    public GeometricObject(){
        dateCreated = new java.util.Date();
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    public String toString(){
        return "created on "+dateCreated+"\ncolor: "+color+" and filled: "+filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}

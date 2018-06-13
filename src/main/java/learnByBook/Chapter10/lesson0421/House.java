package learnByBook.Chapter10.lesson0421;

import learnByBook.Chapter10.lesson0419.Comparable;

import java.util.Date;

/**
 * Created by xin14.zhang on 2018/4/21.
 */
public class House implements Cloneable,Comparable {
    private int id;
    private double area;
    private Date whenBuilt;

    public House(int id,double area){
        this.id = id;
        this.area = area;
        whenBuilt = new Date();
    }
    public  int getId(){
        return id;
    }
    public double getArea(){
        return area;
    }
    public Date getWhenBuilt(){
        return whenBuilt;
    }
    public Object clone(){
        try{
            return super.clone();
        }
        catch (CloneNotSupportedException ex){
            return null;
        }
    }
    public int compareTo(Object o){
        if (area>((House)o).area) return 1;
        else if (area<((House)o).area) return -1;
        else return 0;
    }
}

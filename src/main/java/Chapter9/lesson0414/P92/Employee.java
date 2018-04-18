package Chapter9.lesson0414.P92;

/**
 * Created by xin14.zhang on 2018/4/14.
 */
public class Employee extends Person {
    public String banGongShi;
    public double gongZi;
    MyDate myDate = new MyDate();
    public Employee(){}
    public Employee(String banGongShi,double gongZi,MyDate myDate){
        this.banGongShi = banGongShi;
        this.gongZi = gongZi;
        this.myDate = myDate;
    }
    public String toString(){
        return "The name of the class is Employee \n the name of person is "+super.getName();
    }
}

class MyDate{
    public String year;
    public String month;
    public String day;
    public MyDate(){}
    public MyDate(String year,String month,String day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public String getYear(){
        return year;
    }
    public String getMonth(){
        return month;
    }
    public String getDay(){
        return day;
    }
        }

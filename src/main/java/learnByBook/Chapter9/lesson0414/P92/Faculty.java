package learnByBook.Chapter9.lesson0414.P92;

import java.util.Date;

/**
 * Created by xin14.zhang on 2018/4/15.
 */
public class Faculty extends Employee {
    private String officeTime;
    private String level;
    public Faculty(){}
    public Faculty(String officeTime,String level){
        this.officeTime = officeTime;
        this.level = level;
    }
    public String getOfficeTime(){
        return officeTime;
    }
    public void setOfficeTime(String officeTime){
        this.officeTime = officeTime;
    }
    public String getLevel(){
        return level;
    }
    public void setLevel(String level){
        this.level = level;
    }

    public String toString(){
        return "The name of the class is Faculty \n the name of person is "+super.getName();
    }
}

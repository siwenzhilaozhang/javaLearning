package learnByBook.Chapter9.lesson0414.P92;

/**
 * Created by xin14.zhang on 2018/4/15.
 */
public class Staff extends Employee {
    private String staffName;
    public Staff(){}
    public Staff(String staffName){
        this.staffName = staffName;
    }
    public String getStaffName(){
        return staffName;
    }
    public void setStaffName(String staffName){
        this.staffName = staffName;
    }
    public String toString(){
        return "The name of the class is Staff \n the name of person is "+super.getName();
    }
}

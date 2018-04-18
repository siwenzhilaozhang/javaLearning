package Chapter9.lesson0414.P92;

/**
 * Created by xin14.zhang on 2018/4/14.
 */
public class Student extends Person {
    final String grade1 = "一年级";
    final String grade2 = "二年级";
    final String grade3 = "三年级";
    public String grade;

    public Student(){}
    public Student(String grade){
        this.grade = grade;
    }

    public String toString(){
        return "The name of the class is Student \n the name of person is "+super.getName();
    }
}

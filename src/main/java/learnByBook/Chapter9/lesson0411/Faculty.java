package learnByBook.Chapter9.lesson0411;

/**
 * Created by xin14.zhang on 2018/4/11.
 */
public class Faculty extends Employee {
    public static void main(String[] args){
        new Faculty();
    }
    public Faculty(){
        System.out.println("(4) Faculty`s no-arg constructor is invoked");
    }
}

class Employee extends Person{
    public Employee(){
        this("(2) Invoke Employee`s overloaded constructor");
        System.out.println("(3) Employee`s no-arg constructor is invoked");
    }
    public Employee(String s){
        System.out.println(s);
    }
}

class Person{
    public Person(){
        System.out.println("(1) Person`s no-arg constructor is invoked");
    }
}

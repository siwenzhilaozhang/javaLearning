package learnByBook.Chapter9.lesson0414.P92;

/**
 * Created by xin14.zhang on 2018/4/14.
 */
public class Person {
    private String name;
    private String address;
    private int num;
    private String email;

    public Person(){}
    public Person(String name,String address,int num,String email){
        this.name = name;
        this.address = address;
        this.num = num;
        this.email = email;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num = num;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String toString(){
        return "The name of the class is Person \n the name of person is "+name;
    }
}

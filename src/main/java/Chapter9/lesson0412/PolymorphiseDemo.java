package Chapter9.lesson0412;

/**
 * Created by xin14.zhang on 2018/4/12.
 */
public class PolymorphiseDemo {
    public static void main(String[] args) {
        m(new GraduateStudent());
        m(new Student());
        m(new Person());
        m(new Object());
    }
    public static void m(Object x){
        System.out.println(x.toString());
    }
}
class GraduateStudent extends Student{}
class Student extends Person{
        public String toString(){
            return "Student";
        }
        }
class Person extends Object{
    public String toString(){
        return "Person";
    }
}


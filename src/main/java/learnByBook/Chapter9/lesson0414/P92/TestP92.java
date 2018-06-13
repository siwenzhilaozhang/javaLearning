package learnByBook.Chapter9.lesson0414.P92;


/**
 * Created by xin14.zhang on 2018/4/15.
 */
public class TestP92 {
    public static void main(String[] args) {
        Person person = new Person("zhangsan","guangzhou",3,"zhangsan.com");
        Student student = new Student("一年级");
        MyDate myDate = new MyDate("2018","04","15");
        Employee employee = new Employee("banGongshi",1123, myDate);
        Faculty faculty = new Faculty("17:06","level1");
        Staff staff = new Staff("不知道");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}




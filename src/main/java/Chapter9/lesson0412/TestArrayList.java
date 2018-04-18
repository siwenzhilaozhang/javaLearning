package Chapter9.lesson0412;

import Chapter9.lesson0411.Circle;

import java.util.ArrayList;

/**
 * Created by xin14.zhang on 2018/4/12.
 */
public class TestArrayList {
    public static void main(String[] args) {
        ArrayList cityList = new ArrayList();
        cityList.add("London");
        cityList.add("New York");
        cityList.add("Paris");
        cityList.add("Toronto");
        cityList.add("Hong Kong");
        cityList.add("Singapore");
        System.out.println("List size? "+cityList.size());
        System.out.println("Is Toronto in the list? "+cityList.contains("Toronto"));
        System.out.println("The location of New York in the list? "+cityList.indexOf("New York"));
        System.out.println("Is the list empty? "+cityList.isEmpty());
        cityList.add(2,"Beijing");
        cityList.remove("Toronto");
        cityList.remove(1);
        for (int i=0;i<cityList.size();i++){
            System.out.print(cityList.get(i)+" ");
        }
        System.out.println();
        ArrayList list = new ArrayList();
        list.add(new Circle(2));
        list.add(new Circle(3));
        System.out.println("The area of the circle? "+((Circle)list.get(0)).getArea());
    }
}

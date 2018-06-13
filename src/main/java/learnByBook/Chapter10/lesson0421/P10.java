package learnByBook.Chapter10.lesson0421;

import java.util.Calendar;

/**
 * Created by xin14.zhang on 2018/4/21.
 */
public class P10 {
    public static void main(String[] args) {
      //  Object[] object = new int[10];
        Object[] object1 = new String[10];
        Object[] object2 = new Object[50];
        Object[] object3 = new Calendar[20];

        Number numberRef = new Integer(0);
//        Double doubleRef = (Double)numberRef;
        Double doubleRef1 = Double.valueOf(numberRef.intValue());

        Number X = new Integer(3);
        System.out.println(X.intValue());
        System.out.println(((Comparable)X).compareTo(new Integer(4)));

    }
}

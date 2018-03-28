package Chapter4.lesson0312;

import java.util.Map;

/**
 * Created by xin14.zhang on 2018/3/12.
 */
public class P54 {
    public static void main(String[] args){
        sort(11,12,13);
    }
    public static void sort(double num1,double num2,double num3){
        if(num1>num2){
            double temp = num2;
            num2=num1;
            num1=temp;
        }
        if(num2>num3){
            double temp = num3;
            num3=num2;
            num2=temp;
            if(num2<num1){
                double temp1 = num2;
                num2=num1;
                num1=temp1;
            }
        }
        System.out.println(num1+"<"+num2+"<"+num3);
    }
}

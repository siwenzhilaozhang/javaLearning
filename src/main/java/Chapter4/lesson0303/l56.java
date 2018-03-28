package Chapter4.lesson0303;

/**
 * Created by xin14.zhang on 2018/3/3.
 */
//5.6 重载方法
public class l56 {
    public static void main(String[] args){
        System.out.println("The maximum between 3 and 4 is " + max(3,4));
        System.out.println("The maximum between 3.0 and 4.0 is "+ max(3.0,4.0));
        System.out.println("The maximum between 3.0 and 4.0 and 5.0 is "+ max(3.0,4.0,5.0));
    }
    public static int max(int num1,int num2){
        if(num1 < num2) return num2;
        else return num1;
    }
    public static double max(double num1,double num2){
        if(num1 < num2) return num2;
        else return num1;
    }
    public static double max(double num1,double num2,double num3){
        return max(max(num1,num2),num3);
    }
}

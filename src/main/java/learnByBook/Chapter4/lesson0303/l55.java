package learnByBook.Chapter4.lesson0303;

/**
 * Created by xin14.zhang on 2018/3/3.
 */
//5.5 参数值的传递
public class l55 {
    public static void main(String[] args){
        nPrintln("I am zhangxin!",5);

        int num1=1;
        int num2=2;
        System.out.println("Beform invoking the swap method,num1 is "+num1+" and num2 is "+num2);
        swap(num1,num2);
        System.out.println("After invoking the swap method,num1 is "+num1+" and num2 is "+num2);
    }
    public static void nPrintln(String message,int n){
        for(int i=0;i<n;i++) System.out.println(message);
    }
    public static void swap(int n1,int n2){
        System.out.println("\tInside the swap method");
        System.out.println("\t\tHuman swapping n1 is "+n1+" n2 is "+n2);
        int temp = n1;
        n1=n2;
        n2=temp;
        System.out.println("\t\tAfter swapping n1 is "+n1+" n2 is "+n2);
    }
}

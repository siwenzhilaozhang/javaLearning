package learnByBook.Chapter6.lesson0313;

/**
 * Created by xin14.zhang on 2018/3/13.
 */
//给方法传递数组参数
public class L640 {
    public static void main(String[] args){
        int[] a = {1,2};
        System.out.println("Human invoking swap");
        System.out.println("array is {"+a[0]+","+a[1]+"}");
        swap(a[0],a[1]);
        System.out.println("After invoking swap");
        System.out.println("array is {"+a[0]+","+a[1]+"}");

        System.out.println("Human invoking swapFirstTwoInArray");
        System.out.println("array is {"+a[0]+","+a[1]+"}");
        swapFirstTwoInArray(a);
        System.out.println("After invoking swapFirstTwoInArray");
        System.out.println("array is {"+a[0]+","+a[1]+"}");
    }
    public static void swap(int n1,int n2){
        int temp = n1;
        n1=n2;
        n2=temp;
    }
    public static void swapFirstTwoInArray(int[] array){
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }
}

package learnByBook.Chapter6.lesson0318;

/**
 * Created by xin14.zhang on 2018/3/18.
 */
public class P68 {
    public static void main(String[] args) {
        int[] list1 = {1,2,3,4,5,6};
        double[] list2 = {6.0,4.4,1.9,2.9,3.4,3.5};
        int avg1 = average(list1);
        double avg2 = average(list2);
        System.out.println(avg1+" "+avg2);
    }
    public static int average(int[] array){
        int count = 0;
        for(int i=0;i<array.length;i++){
            count += array[i];
        }
        return count/array.length;
    }
    public static double average(double[] array){
        double count = 0;
        for(int i=0;i<array.length;i++){
            count += array[i];
        }
        return count/array.length;
    }
}

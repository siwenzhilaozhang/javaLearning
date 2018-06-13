package learnByBook.Chapter6.lesson0318;

/**
 * Created by xin14.zhang on 2018/3/18.
 */
public class P67 {
    public static void main(String[] args) {
        int[] num = createNum();
        display(num);
        int[] counts=deal(num);
        display1(counts);
    }
    public static int[] createNum(){
            int[] list=new int[10];
            for(int i=0;i<10;i++){
                list[i]=(int)(Math.random()*10);
            }
            return list;
    }
    public static void display(int[] list1){
        for(int i=0;i<list1.length;i++)System.out.print(list1[i]+" ");
        System.out.println();
    }
    public static int[] deal(int[] list2){
        int[] counts1 = new int[10];
        for(int i=0;i<list2.length;i++){
            counts1[list2[i]-0]++;
        }
        return counts1;
    }
    public static void display1(int[] list3){
        for(int i=0;i<list3.length;i++){
            System.out.println(i+"的个数为"+list3[i]);
        }
    }
}

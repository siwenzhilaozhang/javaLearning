package learnByBook.Chapter6.lesson0313;

/**
 * Created by xin14.zhang on 2018/3/13.
 */
public class l620 {
    public static void main(String[] args){
        double[] myList;
        double[] myList1 = new double[10];
        System.out.println(myList1.length);
        double[] myList2 = {1,2,3,4};
        System.out.println(myList2[0]+myList2[1]);
        //用随机数初始化数组
        double[] myList3 = new double[5];
        for(int i=0;i<myList3.length;i++){
            myList3[i] = Math.random()*100;
        }
        //输出数组
        for(int i=0;i<myList3.length;i++){
            System.out.print(myList3[i]+" ");
        }
        char[] myList4 = {'C','H','I','N','A'};
        System.out.println(myList4);
        //对所有元素求和
        int count = 0;
        for(int i=0;i<myList2.length;i++){
            count += myList2[i];
        }
        System.out.println(count);
        //查找最大无素
        double max=myList2[0];
        for(int i=1;i<myList2.length;i++){
            if(max<myList2[i])max = myList2[i];
        }
        System.out.println(max);
        //查找最大元素的最小下标值
        double[] myList5 = {1,5,3,4,5,5};
        double max1=myList5[0];
        int min=0;
        for(int i=1;i<myList5.length;i++){
            if(max1<myList5[i]){
                max1=myList5[i];
                min=i;
            }
        }
        System.out.println(max1+","+min);
        //foreach循环
        for(double element:myList5){System.out.println(element);}

    }
}

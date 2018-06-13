package learnByBook.Chapter6.lesson0313;

/**
 * Created by xin14.zhang on 2018/3/13.
 */
//复制数组
public class L630 {
    public static void main(String[] args){
        int[] sourceArray = {2,3,1,5,10};
        int[] targetArray = new int[sourceArray.length];
        //使用循环复制数组
        for(int i=0;i<sourceArray.length;i++){
            targetArray[i]=sourceArray[i];
            System.out.println(targetArray[i]);
        }
        //使用arraycopy复制
        System.arraycopy(sourceArray,0,targetArray,0,sourceArray.length);
        printArray(targetArray);
    }
    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+" ");
    }
}

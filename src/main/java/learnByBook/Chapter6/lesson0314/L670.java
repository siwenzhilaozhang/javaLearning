package learnByBook.Chapter6.lesson0314;

/**
 * Created by xin14.zhang on 2018/3/14.
 */
//数组的查找
public class L670 {
    public static void main(String[] args) {

    }
    //线性查找
    public static int linearSearch(int[] list,int key){
        for(int i=0;i<list.length;i++){
            if(key == list[i])return i;
        }
        return -1;
    }
    //二分查找法
    public static int binarySearch(int[] list,int key){
        int low=0;
        int high=list.length-1;
        while(high>=low){
            int mid =(low+high)/2;
            if(key<list[mid])high=mid-1;
            else if(key==list[mid])return mid;
            else low=mid+1;
        }
        return -low-1;
    }
}

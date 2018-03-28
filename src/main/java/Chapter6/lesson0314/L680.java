package Chapter6.lesson0314;

/**
 * Created by xin14.zhang on 2018/3/14.
 */
//数组的排序
public class L680 {
    public static void main(String[] args) {
        selectionSort(new double[]{2,1});
        selectionSort(new double[]{2,3,1});
        selectionSort(new double[]{1,2,1});
    }
    //选择排序法
    public static void selectionSort(double[] list){
        for(int i=list.length-1;i>0;i--){
            double currentMax = list[0];
            int currentMaxIndex = 0;
            for(int j=1;j<=i;j++){
                if(currentMax<list[j]){
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }
            if(currentMaxIndex!=i){
                list[currentMaxIndex]=list[i];
                list[i]=currentMax;
            }
        }
    }
    //插入排序法
    public static void insertionSort(double[] list){
        for(int i=1;i<list.length;i++){
            double currentElement=list[i];
            int k;
            for(k=i-1;k>=0&&list[k]>currentElement;k--){
                list[k+1]=list[k];
            }
            list[k+1]=currentElement;
        }
    }
}

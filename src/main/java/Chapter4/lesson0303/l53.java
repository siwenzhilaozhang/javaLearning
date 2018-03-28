package Chapter4.lesson0303;

/**
 * Created by xin14.zhang on 2018/3/3.
 */
//非void方法的调用
public class l53 {
    public static void main(String[] args){
        int i=5;
        int j=2;
        int k=max(i,j);
        System.out.println("The maximum between "+i+" and "+j+" is "+k);
    }
    public static int max(int num1,int num2){
        int result;
        if(num1>num2)result = num1;
        else result=num2;
        return result;
    }
}

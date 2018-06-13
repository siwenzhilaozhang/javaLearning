package learnByBook.Chapter4.lesson0312;

/**
 * Created by xin14.zhang on 2018/3/12.
 */
//求一个整数各位数字之和
public class P52 {
    public static void main(String[] args){
        System.out.println(sumDigits(234));
    }
    public static int sumDigits(long n){
        int result=0;
        while(n!=0){
            int i=(int)n%10;
            n=n/10;
            result+=i;
        }
        return result;
    }
}

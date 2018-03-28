package Chapter4.lesson0312;

/**
 * Created by xin14.zhang on 2018/3/12.
 */
//显示倒置的整数，如3456显示6543
public class P53 {
    public static void main(String[] args){
        reverse(34567);
        int n=reverse1(34567);
        System.out.println(n);
    }
    public static void reverse(int number){
        String output="";
        while(number!=0){
            int i=number%10;
            output += i;
            number = number/10;
        }
        System.out.println(output);
    }
    public static int reverse1(int number){
        String outputString="";
        while(number!=0){
            int i=number%10;
            outputString += i;
            number = number/10;
        }
        int output = Integer.parseInt(outputString);
        return output;
    }
}

package Chapter4.lesson0303;

/**
 * Created by xin14.zhang on 2018/3/3.
 */
public class l491 {
    public static void main(String[] args){
        int sum = 0;
        int i;
        for(i=1;i<=20;i++){
            sum +=i;
            if(sum>=100)break;
        }
        System.out.println(i);
        System.out.println(sum);
    }
}

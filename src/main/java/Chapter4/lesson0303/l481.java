package Chapter4.lesson0303;
//求输入两个正整数的最大公约数
import javax.swing.*;

/**
 * Created by xin14.zhang on 2018/3/3.
 */
public class l481 {
    public static void main(String[] args){
        //输入两个正整数
        String iString = JOptionPane.showInputDialog(null,"请输入第一个正整数：");
        int i = Integer.parseInt(iString);
        String jString = JOptionPane.showInputDialog(null,"请输入第二个正整数：");
        int j = Integer.parseInt(jString);
     //法一：
/*        //比较输入大小，求最大公约数
        int k;
        if(i<=j) k=i;
        else k=j;
        //求最大公约数
        while((i%k)!=0 || (j%k)!=0){k--;}*/
     //法二:
        int a=1;
        int k=1;
        while(a<=i&&a<=j) {
            if (i % a == 0 && j % a == 0) k = a;
            a++;
        }

        JOptionPane.showMessageDialog(null,"The greatest common divisor for "+i +" and " +j +" is "+k);
        }
    }

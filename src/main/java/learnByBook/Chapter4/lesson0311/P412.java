package learnByBook.Chapter4.lesson0311;

import javax.swing.*;

/**
 * Created by xin14.zhang on 2018/3/11.
 */
//用while循环求n的平方大于12000的最小整数N
public class P412 {
    public static void main(String[] args){
        int n=0;
        while(n*n<=12000)n++;
        JOptionPane.showMessageDialog(null,n);
    }
}

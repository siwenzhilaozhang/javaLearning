package learnByBook.Chapter4.lesson0311;

import javax.swing.*;

/**
 * Created by xin14.zhang on 2018/3/11.
 */
//用while循环求n的三次方小于12000的最大整数N
public class P413 {
    public static void main(String[] args){
        int n=0;
        while(n*n*n<=12000)n++;
        JOptionPane.showMessageDialog(null,n-1);
    }
}

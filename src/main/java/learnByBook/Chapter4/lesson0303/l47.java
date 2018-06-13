package learnByBook.Chapter4.lesson0303;

import javax.swing.*;

/**
 * Created by xin14.zhang on 2018/3/3.
 */
public class l47 {
    public static void main(String[] args){
        float sum = 0;
        for(float i = 0.01f;i<=1.0f;i+=0.01f){
            sum += i;
        }
        JOptionPane.showMessageDialog(null,"The sum is "+sum);
    }
}

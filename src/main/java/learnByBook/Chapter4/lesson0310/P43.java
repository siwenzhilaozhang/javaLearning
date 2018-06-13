package learnByBook.Chapter4.lesson0310;

import javax.swing.*;

/**
 * Created by xin14.zhang on 2018/3/10.
 */
//千克转换成磅
//如何显示小数点后一位？？？
public class P43 {
    public static void main(String[] args){
        String output = "千克    磅\n";
        for(int i=1;i<=199;i+=2){
           double j=i*22/10.0;
         //   double j=i*2.2;
            output += "  "+i+"        "+j+"\n";
        }
        JOptionPane.showMessageDialog(null,output);
    }
}

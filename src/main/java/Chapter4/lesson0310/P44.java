package Chapter4.lesson0310;

import javax.swing.*;

/**
 * Created by xin14.zhang on 2018/3/10.
 */
//英里转换成千米
public class P44 {
    public static void main(String[] args){
        String output = "英里    千米\n";
        for(int i=1;i<=10;i++){
            double j = i*1.609;
            if(i<10)output += i+"          "+j+"\n";
            else output += i+"        "+j+"\n";
        }
        JOptionPane.showMessageDialog(null,output);
    }
}

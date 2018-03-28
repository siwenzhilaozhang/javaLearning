package Chapter4.lesson0303;

import javax.swing.*;

/**
 * Created by xin14.zhang on 2018/3/3.
 */
public class l482 {
    public static void main(String[] args){
        double sales=10000;
        double ticheng;
        do{
            sales++;
            ticheng = 5000*0.08 + (10000-5000)*0.1 + (sales-10000)*0.12;
        }while(ticheng<25000);
        JOptionPane.showMessageDialog(null,"The sales amount $"+sales+"\n is needed to make a commission of $"+ticheng);
    }
}

package Chapter4.lesson0311;

import javax.swing.*;

/**
 * Created by xin14.zhang on 2018/3/11.
 */
//显示100-1000之间所有能被5和6整除的数，每行显示10个
public class P410 {
    public static void main(String[] args){
        String output = "";
        int count = 0;
        for(int i=100;i<=1000;i++){
            if(i%5==0&&i%6==0){
                output +=(i+"  ");
                count++;
                if(count%10==0)output+="\n";
            }
        }
        JOptionPane.showMessageDialog(null,output);
    }
}

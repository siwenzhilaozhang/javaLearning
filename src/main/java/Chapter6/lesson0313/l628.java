package Chapter6.lesson0313;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

/**
 * Created by xin14.zhang on 2018/3/13.
 */
public class l628 {
    public static void main(String[] args){
        int[] list = new int[6];
        int max = 0,num=0;
        for(int i=0;i<list.length;i++){
            String shuRuString = JOptionPane.showInputDialog(null,"请输入一位整数");
            int shuRu = Integer.parseInt(shuRuString);
            list[i]=shuRu;
            //list[i]=Integer.parseInt(shuRuString);
            if(max<list[i]){
                max = list[i];
                num=1;
            }
            else if(max==list[i])num++;
        }
        String output = "The array is ";
        for(int i=0;i<list.length;i++){
            output += list[i]+" ";
        }
        output += "\nThe largest number is "+max+"\nThe occurrence count of the largest number is "+num;
        JOptionPane.showMessageDialog(null,output);
    }
}

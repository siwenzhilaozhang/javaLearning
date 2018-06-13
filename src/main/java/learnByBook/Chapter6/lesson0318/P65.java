package learnByBook.Chapter6.lesson0318;

import javax.swing.*;

/**
 * Created by xin14.zhang on 2018/3/18.
 */
//读入10个数且显示其互不相同的数2
public class P65 {
    public static void main(String[] args) {
        int[] list = new int[10];
        int num=0;
        for(int i=0;i<10;i++){
            String inputString = JOptionPane.showInputDialog(null,"请输入数字");
            int input = Integer.parseInt(inputString);
            boolean isAbsent = true;
            for(int j=0;j<num;j++){
                if(input==list[j]){
                    isAbsent = false;
                    break;
                }
            }
            if(isAbsent){
                list[num]=input;
                num++;
            }
        }

        for(int i=0;i<num;i++)System.out.println(list[i]);
    }
}
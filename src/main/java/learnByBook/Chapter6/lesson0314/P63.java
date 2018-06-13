package learnByBook.Chapter6.lesson0314;

import javax.swing.*;

/**
 * Created by xin14.zhang on 2018/3/14.
 */
//倒置输入数顺序
public class P63 {
    public static void main(String[] args) {
        int[] list = new int[10];
        int[] list1=new int[10];
        for(int i=0,j=list.length-1;i<list.length;i++,j--){
            String numString = JOptionPane.showInputDialog(null,"请输入第"+(i+1)+"个数字");
            list[i]=Integer.parseInt(numString);
            list1[j]=list[i];
        }
        for (int num : list1) {
            System.out.print(num);
        }
    }
}

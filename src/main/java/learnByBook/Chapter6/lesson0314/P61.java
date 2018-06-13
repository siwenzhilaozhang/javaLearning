package learnByBook.Chapter6.lesson0314;

import javax.swing.*;

/**
 * Created by xin14.zhang on 2018/3/14.
 */
public class P61 {
    public static void main(String[] args) {
        //读入10个数字,并计算总和
        int zongHe = 0;
        int[] list = new int[10];
        for(int i=0;i<list.length;i++){
            String numString = JOptionPane.showInputDialog(null,"请输入第"+(i+1)+"个数字");
            list[i]=Integer.parseInt(numString);
            zongHe+=list[i];
        }
        //求平均值及超过平均值的数量
        int avg = zongHe/10;
        int count = 0;
        for(int i=0;i<list.length;i++){
            if(list[i]>avg)count++;
        }
        System.out.println("平均值为"+avg+",超过平均值个数为"+count);
    }
}

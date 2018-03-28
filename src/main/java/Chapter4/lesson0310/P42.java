package Chapter4.lesson0310;

import javax.swing.*;

/**
 * Created by xin14.zhang on 2018/3/10.
 */
//（统计正数和负数的个数，并计算这些数的平均值）读入一些整数，个数未指定，求出读入的正数和负数的个数，并计算它们的总和及平均值，0不参与。当输入为0时，程序结束，平均值浮点数。
public class P42 {
    public static void main(String[] args){
        int countZheng = 0;
        int countFu = 0;
        int sum = 0;
        double avg;
        int shuRu;
        do{
            String shuRuString = JOptionPane.showInputDialog(null,"请输入整数，若输入0则结束");
            shuRu = Integer.parseInt(shuRuString);
            sum += shuRu;
            if(shuRu>0) countZheng++;
            else if(shuRu<0) countFu++;
        }while(shuRu!=0);
        avg = sum/(countZheng+countFu);
        JOptionPane.showMessageDialog(null,"输入正数个数为"+countZheng+",输入负数个数为"+countFu+",总和为"+sum+",平均值为"+avg);
    }
}

package learnByBook.Chapter4.lesson0310;

import javax.swing.*;

/**
 * Created by xin14.zhang on 2018/3/10.
 */
/**
 * 假设今年某大学的学费为10000美元，学费的年增长率为5%。计算10年后的学费。统计从现在开始的十后后算起，
 * 四年内学费的总费用是多少
 */
//如何显示小数点后一位？？？
public class P47 {
    public static void main(String[] args){
        double studyFee = 10000;
        String output ="";
        //计算10年后的学费
        for(int i=1;i<=10;i++){
            studyFee = (studyFee*(1+0.05)*100)/100.0;
        }
        output += "10年后的学费为"+studyFee+"\n";
        //计算10年后的连续4年的学费
        int sumFee = 0;
        for(int i=1;i<=4;i++){
            studyFee = studyFee*(1+0.05);
            sumFee += studyFee;
        }
        output += "10年后4年的学费为"+sumFee;
        JOptionPane.showMessageDialog(null,output);
    }
}

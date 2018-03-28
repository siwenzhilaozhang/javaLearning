package Chapter6.lesson0318;

import javax.swing.*;

/**
 * Created by xin14.zhang on 2018/3/18.
 */
//读入数目不确定的考试分数，并且判断有多少个分数高于或等于平均分，有多少个分数低于平均分。
// 输入一个负数标志输入结束，假设最高分为100.

public class P64 {
    public static void main(String[] args) {
        //输入成绩
        int[] score = new int[100];
        int input;
        int scoreAll=0;
        double num=0;
        int i=0;
        do{
            String inputString = JOptionPane.showInputDialog(null,"请输入低于100的考试分数，输入负数则结束");
            input = Integer.parseInt(inputString);
            score[i]=input;
            i++;num++;
            scoreAll+=input;
        }while(input > 0);
        //求平均分等
        double avg=(scoreAll-score[i-1])/(num-1);
        int avgSmallNum=0,avgBigNum=0;
        for(int j=0;j<num-1;j++){
            if(score[j]>=avg)avgBigNum++;
            else avgSmallNum++;
            System.out.print(score[j]);
        }
        System.out.println();
        System.out.println(avgBigNum+" "+avgSmallNum);
    }
}

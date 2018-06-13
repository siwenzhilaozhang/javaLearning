package learnByBook.Chapter6.lesson0313;

import javax.swing.*;

/**
 * Created by xin14.zhang on 2018/3/13.
 */
public class L629 {
    public static void main(String[] args){
        //输入学生总数
        String numString = JOptionPane.showInputDialog(null,"please enter number of students:");
        int num = Integer.parseInt(numString);
        int[] score=new int[num];
        //输入所有分数
        for(int i=0;i<num;i++){
            String scoreString = JOptionPane.showInputDialog(null,"Please enter a score:");
            score[i]=Integer.parseInt(scoreString);
        }
        //找出分数最大值----注意找出最大值可以在输入所有分数时完成
        int maxScore = score[0];
        for(int i=1;i<score.length;i++){
            if(maxScore<score[i])maxScore=score[i];
        }
        //输出结果
        String output = "";
//        for(int i=0;i<score.length;i++){
//            if((maxScore-score[i])<=10) output+="Student "+i+" score is "+score[i]+" and grade is A\n";
//            else if((maxScore-score[i])<=20) output+="Student "+i+" score is "+score[i]+" and grade is B\n";
//            else if((maxScore-score[i])<=30) output+="Student "+i+" score is "+score[i]+" and grade is C\n";
//            else if((maxScore-score[i])<=40) output+="Student "+i+" score is "+score[i]+" and grade is D\n";
//            else output+="Student "+i+" score is "+score[i]+" and grade is E\n";
//        }
        for(int i=0;i<score.length;i++){
            String grade = "";  //注意grade可以用char型，char grade ='A';
            if((maxScore-score[i])<=10) grade = "A";
            else if((maxScore-score[i])<=20) grade = "B";
            else if((maxScore-score[i])<=30) grade = "C";
            else if((maxScore-score[i])<=40) grade = "D";
            else  grade = "D";
            output+= "Student "+i+" score is "+score[i]+" and grade is "+grade+"\n";
        }
        JOptionPane.showMessageDialog(null,output);
    }
}

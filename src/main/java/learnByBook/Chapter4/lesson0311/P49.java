package learnByBook.Chapter4.lesson0311;

import javax.swing.*;

/**
 * Created by xin14.zhang on 2018/3/11.
 */
//提示用户输入学生的数量及每个学生的名字和得分，而后显示得分最高的学生和第二高的学生
public class P49 {
    public static void main(String[] args){
        String nameMax = "";
        int scoreMax = 0;
        String nameSecond = "";
        int scoreSecond = 0;
        int i =1;
        String countString = JOptionPane.showInputDialog(null,"请输入学生的数量");
        int count = Integer.parseInt(countString);
        do{
            String name = JOptionPane.showInputDialog(null,"请输入学生的姓名");
            String scoreString = JOptionPane.showInputDialog(null,"请输入学生的分数");
            int score = Integer.parseInt(scoreString);
            if(score>scoreMax){
                nameSecond = nameMax;
                scoreSecond = scoreMax;
                nameMax = name;
                scoreMax = score;
            }
            else if(score > scoreSecond){
                nameSecond = name;
                scoreSecond = score;
            }
            i++;
         }while(i<=count);
        String outputMax = "得分最高的学生名字为"+nameMax+",得分为"+scoreMax+"\n";
        String outputSecond = "得分第二高的学生名字为"+nameSecond+",得分为"+scoreSecond;
        JOptionPane.showMessageDialog(null,outputMax+outputSecond);
    }
}

package learnByBook.Chapter4.lesson0311;

import javax.swing.*;

/**
 * Created by xin14.zhang on 2018/3/10.
 */
//提示用户输入学生的数量及每个学生的名字和得分，而后显示得分最高的学生
public class P48 {
    public static void main(String[] args){
        String countString= JOptionPane.showInputDialog(null,"请输入学生的数量");
        int count = Integer.parseInt(countString);
        String nameMax = "";
        int scoreMax= 0;
        for(int i=1;i<=count;i++){
            String name = JOptionPane.showInputDialog(null,"请输入学生的名字");
            String scoreString = JOptionPane.showInputDialog(null,"请输入学生的分数");
            int score = Integer.parseInt(scoreString);
            if(score > scoreMax){
                nameMax = name;
                scoreMax = score;
            }
        }
        JOptionPane.showMessageDialog(null,"得分最高的学生名字是"+nameMax+",分数是"+scoreMax);
    }
}

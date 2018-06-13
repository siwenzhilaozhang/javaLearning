package learnByBook.Chapter4.lesson0303;

import javax.swing.*;

/**
 * Created by xin14.zhang on 2018/3/3.
 */
//???怎么生成1-15内的整数？
public class P41 {
    public static void main(String[] args){
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = "";
        while(count<10){
            //生成两个数
            int number1 = (int)(1+Math.random()*15);
            int number2 = (int)(1+Math.random()*15);
            //显示公式并获取结果
            String answerString = JOptionPane.showInputDialog("What is "+number1+" + "+number2+" ?" );
            int answer = Integer.parseInt(answerString);
            String replyString;
            if(number1+number2 == answer){
                replyString = "you are correct!";
                correctCount++;
            }
            else replyString = "you are wrong.\n"+number1 + "+" + number2 + " shoule be "+(number1+number2);
            JOptionPane.showMessageDialog(null,replyString);
            count++;
            output += "\n"+number1 + "+" + number2 + "=" + answer + ((number1+number2 == answer)?"correct":"wrong");
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        JOptionPane.showMessageDialog(null,"Correct count is "+correctCount+"\nTest time is "+testTime/1000 + " seconds\n" + output);
    }
    }









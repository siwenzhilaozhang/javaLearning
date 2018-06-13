package learnByBook.Chapter4.lesson0303;

/**
 * Created by xin14.zhang on 2018/3/3.
 */
import javax.swing.JOptionPane;

public class l411 {
    public static void main(String[] args){
        int correctCount = 0;
        int option = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = "";
        while(option == JOptionPane.YES_OPTION){
            //生成两个数
            int number1 = (int)(Math.random()*10);
            int number2 = (int)(Math.random()*10);
            if(number1<number2){
                int temp = number2;
                number2=number1;
                number1=temp;
            }
            //显示公式并获取结果
            String answerString = JOptionPane.showInputDialog("What is "+number1+" - "+number2+" ?" );
            int answer = Integer.parseInt(answerString);
            String replyString;
            if(number1-number2 == answer){
                replyString = "you are correct!";
                correctCount++;
            }
            else replyString = "you are wrong.\n"+number1 + "-" + number2 + " shoule be "+(number1-number2);
            JOptionPane.showMessageDialog(null,replyString);
           // count++;
            output += "\n"+number1 + "-" + number2 + "=" + answer + ((number1-number2 == answer)?"correct":"wrong");
            //用户决定是否继续回答下一题
            option = JOptionPane.showConfirmDialog(null,"continue?");
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        JOptionPane.showMessageDialog(null,"Correct count is "+correctCount+"\nTest time is "+testTime/1000 + " seconds\n" + output);
    }

}

package learnByBook.Chapter3.lesson0210;

/**
 * Created by xin14.zhang on 2018/2/10.
 */
import javax.swing.JOptionPane;

public class SubtractionTutor {
    public static void main(String[] args){
        int number1 = (int)(Math.random()*10);
        int number2 = (int)(Math.random()*10);
        if(number1<number2){
            int number3 = number1;
            number1 = number2;
            number2 = number3;
        }
        String answerString = JOptionPane.showInputDialog("What is " + number1 + "-" + number2 + "?" );
        int answer = Integer.parseInt(answerString);
        if (answer == (number1-number2)){
            JOptionPane.showMessageDialog(null,"your answer is correct!");
        }
        else JOptionPane.showMessageDialog(null,"your answer is incorrect!");
        //书上输出写法
//        String replyString;
//        if (answer == (number1-number2))
//            replyString = "your answer is correct!";
//        else replyString = "your answer is incorrect!";
//        JOptionPane.showMessageDialog(null,replyString);

    }
}

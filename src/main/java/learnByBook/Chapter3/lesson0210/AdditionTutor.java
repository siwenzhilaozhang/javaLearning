package learnByBook.Chapter3.lesson0210;

/**
 * Created by xin14.zhang on 2018/2/10.
 */
import javax.swing.JOptionPane;

public class AdditionTutor {
    public static void main(String[] args) {
        int number1 = (int)(System.currentTimeMillis()%10);
        int number2 = (int)(System.currentTimeMillis()*7%10);
        String answerString = JOptionPane.showInputDialog("What is "+number1+"+"+number2+"?");
        int answer = Integer.parseInt(answerString);
        JOptionPane.showMessageDialog(null,number1 + "+" + number2 + "=" + answer + " is " + (number1+number2 == answer));
    }
}

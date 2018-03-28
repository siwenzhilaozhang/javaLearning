package Chapter2.lesson0210;

/**
 * Created by xin14.zhang on 2018/2/10.
 */
import javax.swing.JOptionPane;

public class ComputeChange {
    public static void main(String[] args){
        String amountString = JOptionPane.showInputDialog("Enter an amount in double,for example 11.56:");
        double amount = Double.parseDouble(amountString);

        int remainingAmount = (int)(amount * 100);
        int numberOfOneDollors = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        int numberOfPennies = remainingAmount;

        String output = "Your amount "+amount + "consists of \n" +
                numberOfOneDollors + "dollars\n" +
                numberOfQuarters + "quarters\n" +
                numberOfDimes + "dimes\n" +
                numberOfNickels + "nickels\n" +
                numberOfPennies + "pennies\n";
        JOptionPane.showMessageDialog(null,output);
    }
}

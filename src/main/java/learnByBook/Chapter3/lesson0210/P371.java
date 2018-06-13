package learnByBook.Chapter3.lesson0210;

import javax.swing.*;

/**
 * Created by xin14.zhang on 2018/2/10.
 */
public class P371 {
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

        String output = "Your amount "+amount + "consists of \n";
        if(numberOfOneDollors > 0){
            output += numberOfOneDollors + "dollars\n";
        }
        if(numberOfQuarters > 0){
            output += numberOfQuarters + "quarters\n";
        }
        if(numberOfDimes > 0){
            output += numberOfDimes + "dimes\n";
        }
        if(numberOfNickels > 0){
            output += numberOfNickels + "nickels\n";
        }
        if(numberOfPennies > 0){
            output += numberOfPennies + "pennies\n";
        }
        JOptionPane.showMessageDialog(null,output);
    }
}

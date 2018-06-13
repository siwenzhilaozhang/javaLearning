package learnByBook.Chapter3.lesson0210;

import javax.swing.JOptionPane;

/**
 * Created by xin14.zhang on 2018/2/10.
 */
public class P37 {
    public static void main(String[] args){
        String amountString = JOptionPane.showInputDialog("Enter an amount in double,for example 23.67:");
        double amount = Double.parseDouble(amountString);

        int remainingAmount = (int)(amount * 100);
        int numberOfOneDollars = remainingAmount / 100;
        String Dollar = "";
        if(numberOfOneDollars>0){
            if(numberOfOneDollars ==1) Dollar = numberOfOneDollars + "dollar";
            else Dollar = numberOfOneDollars + "dollars";
        }

        remainingAmount = remainingAmount % 100;
        int numberOfQuarters = remainingAmount / 25;
        String Quarter = "";
        if(numberOfQuarters>0){
            if(numberOfQuarters ==1) Quarter = numberOfQuarters + "quarter";
            else Quarter = numberOfQuarters + "quarters";
        }

        remainingAmount = remainingAmount % 25;
        int numberOfDimes = remainingAmount / 10;
        String Dime = "";
        if(numberOfDimes>0){
            if(numberOfDimes ==1) Dime = numberOfDimes + "Dime";
            else Dime = numberOfDimes + "Dimes";
        }

        remainingAmount = remainingAmount % 10;
        int numberOfNickels = remainingAmount / 5;
        String Nickel = "";
        if(numberOfNickels>0){
            if(numberOfNickels ==1) Nickel = numberOfNickels + "Nickel";
            else Nickel = numberOfNickels + "Nickels";
        }

        remainingAmount = remainingAmount % 5;
        int numberOfPennies = remainingAmount;
        String Penny = "";
        if(numberOfPennies>0){
            if(numberOfPennies ==1) Penny = numberOfPennies + "Penny";
            else Penny = numberOfPennies + "Pennies";
        }

        String output = "Your amount "+amount + "consists of \n" +
                Dollar +"\n" + Quarter +"\n" + Dime +"\n" + Nickel +"\n" + Penny;
        JOptionPane.showMessageDialog(null,output);
    }
}

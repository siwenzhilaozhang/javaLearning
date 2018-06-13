package learnByBook.Chapter8.lesson0330;

import javax.swing.*;

/**
 * Created by xin14.zhang on 2018/3/30.
 */
public class P821 {
    public static void main(String[] args) {
        String inputString = JOptionPane.showInputDialog(null,"Enter a string:");
        char[] inputChar = inputString.toCharArray();
        char[] inputChar2 = new char[inputChar.length];
        for(int i=0;i<inputChar.length;i++){
            inputChar2[i] = inputChar[inputChar.length-1-i];
        }
        String inputString2=new String(inputChar2);
        //String inputString2 = String.valueOf(inputChar2);
        String output;
        if(inputString.equals(inputString2)) {
            output = inputString +" is a palindrome";
        }
        else output = inputString + " is not a palindrome";
        JOptionPane.showMessageDialog(null,output);
    }
}

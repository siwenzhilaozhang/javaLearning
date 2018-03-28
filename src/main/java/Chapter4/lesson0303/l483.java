package Chapter4.lesson0303;

import javax.swing.*;

/**
 * Created by xin14.zhang on 2018/3/3.
 */
public class l483 {
    public static void main(String[] args){
        String numberOfLinesString = JOptionPane.showInputDialog("Enter the number of lines: ");
        int numberOfLines = Integer.parseInt(numberOfLinesString);
//        String output = "";
//        for(int n=1;n<=numberOfLines;n++){
//            for(int i=1;i<=(numberOfLines-n);i++) output +="   ";
//            for(int i=n;i>=1;i--) output +=((i>=10)?" "+i:"  "+i);
//            for(int i=2;i<=n;i++) output +=((i>=10)?" "+i:"  "+i);
//            output +="\n";
//        }
//        JOptionPane.showMessageDialog(null,output);
        for(int n=1;n<=numberOfLines;n++){
            for(int i=1;i<=(numberOfLines-n);i++) System.out.print("   ");
//            for(int i=1;i<=(numberOfLines-i);i++) System.out.print("   ");
            for(int i=n;i>=1;i--) System.out.print((i>=10)?" "+i:"  "+i);
            for(int i=2;i<=n;i++) System.out.print((i>=10)?" "+i:"  "+i);
            System.out.println();
        }
    }
}

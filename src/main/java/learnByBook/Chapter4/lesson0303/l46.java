package learnByBook.Chapter4.lesson0303;

import javax.swing.*;

/**
 * Created by xin14.zhang on 2018/3/3.
 */
public class l46 {
    public static void main(String[] args){
        String output = "          Multiplication Table\n";
        output += "-------------------------------------------\n";
        output += "   |";
        for(int i=1;i<10;i++){
            output +="    "+i;
        }
        output += "\n";
        for(int j=1;j<10;j++){
            output += j + " | ";
            for(int i=1;i<10;i++){
                if(i*j<10) output += "    "+i*j;
                else output += "  "+i*j;
            }
            output +="\n";
        }
        JOptionPane.showMessageDialog(null,output);
    }
}

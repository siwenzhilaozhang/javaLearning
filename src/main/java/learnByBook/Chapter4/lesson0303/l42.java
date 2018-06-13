package learnByBook.Chapter4.lesson0303;

/**
 * Created by xin14.zhang on 2018/3/3.
 */
import javax.swing.JOptionPane;

public class l42 {
    public static void main(String[] args){
//法一：
/*        String dataString = JOptionPane.showInputDialog("Enter an int value:\n(the program exits if the input is 0)");
        int data = Integer.parseInt(dataString);
        int sum = 0;
        while(data!=0){
            sum +=data;
            dataString = JOptionPane.showInputDialog("Enter an int value:\n(the program exits if the input is 0)");
            data = Integer.parseInt(dataString);
        }*/
//法二：
/*        int data = 1;
        String dataString;
        int sum = 0;
        while(data!=0){
            data = 0;
            dataString = JOptionPane.showInputDialog("Enter an int value:\n(the program exits if the input is 0)");
            data = Integer.parseInt(dataString);
            sum +=data;
        }*/
//法三：
        String dataString;
        int data;
        int sum = 0;
        do {
            dataString = JOptionPane.showInputDialog("Enter an int value:\n(the program exits if the input is 0)");
            data = Integer.parseInt(dataString);
            sum += data;
        }while(data!=0);

        JOptionPane.showMessageDialog(null,"The sum is "+ sum);
    }
}

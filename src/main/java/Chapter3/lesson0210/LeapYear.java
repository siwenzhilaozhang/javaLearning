package Chapter3.lesson0210;

/**
 * Created by xin14.zhang on 2018/2/10.
 */
import javax.swing.JOptionPane;

public class LeapYear {
    public static void main(String[] args){
        String yearString = JOptionPane.showInputDialog("Enter a year");
        int year = Integer.parseInt(yearString);
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0)||(year % 400 == 0);
        JOptionPane.showMessageDialog(null,year + " is a leap year? " + isLeapYear);
    }
}

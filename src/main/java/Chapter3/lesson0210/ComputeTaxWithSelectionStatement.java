package Chapter3.lesson0210;

/**
 * Created by xin14.zhang on 2018/2/10.
 */
import javax.swing.JOptionPane;

public class ComputeTaxWithSelectionStatement {
    public static void main(String[] args){
        //输入纳税人类型
        String statusString = JOptionPane.showInputDialog("Enter the filing status:\n" +
                "(0-single filer,1-married jointly,\n" +
                "2-married separately,3-head of household)");
        int status = Integer.parseInt(statusString);
        //输入纳税金额
        String incomeString = JOptionPane.showInputDialog("Enter the taxable income:");
        double income = Double.parseDouble(incomeString);
        //计算纳税金额
        double tax = 0;
        if (status == 0){
            if(income <= 6000) tax = income*0.10;
            else if(income <= 27950) tax = 6000*0.10 + (income-6000)*0.15;
            else if(income <= 67700) tax = 6000*0.10 + (27950-6000)*0.15 + (income-27950)*0.27;
            else if(income <= 141250) tax = 6000*0.10 + (27950-6000)* 0.15 + (67700-27950)*0.27 + (income-67700)*0.3;
            else if(income <= 307050) tax = 6000*0.10 + (27950-6000)* 0.15 + (67700-27950)*0.27 + (141250-67700)*0.3 + (income-141250)*0.35;
            else tax = 6000*0.10 + (27950-6000)* 0.15 + (67700-27950)*0.27 + (141250-67700)*0.3 + (307050-141250)*0.35 + (income-307050)*0.386;
        }
        else if(status ==1){}
        else if(status ==2){}
        else if(status ==3){}
        else {
            System.out.println("Error:invalid status");
            System.exit(0);
        }
        JOptionPane.showMessageDialog(null,"Tax is "+(int)(tax*100)/100.0);
    }
}

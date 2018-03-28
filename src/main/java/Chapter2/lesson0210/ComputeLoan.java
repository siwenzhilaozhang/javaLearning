package Chapter2.lesson0210;

/**
 * Created by xin14.zhang on 2018/2/10.
 */
import javax.swing.JOptionPane;

public class ComputeLoan {
    public static void main(String[] args){
        //输入贷款年利率
        String annualInterestRateString = JOptionPane.showInputDialog("Enter yearly interest rate,for example 8.25:");
        double annualInterestRate = Double.parseDouble(annualInterestRateString);
        double monthlyInterestRate = annualInterestRate / 1200;
        //输入贷款年数
        String numberOfYearsString = JOptionPane.showInputDialog("Enter number of years as an integer,\nfor eaxmple 3:");
        int numberOfYears = Integer.parseInt(numberOfYearsString);
        //输入贷款总额
        String loanString = JOptionPane.showInputDialog("Enter loan amount,for example 12000.95:");
        double loanAmount = Double.parseDouble(loanString);
        //计算月支付金额及总贷款金额
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1/Math.pow(1+monthlyInterestRate,numberOfYears*12));
        double totalPayment = monthlyPayment * numberOfYears * 12;
        monthlyPayment = (int)(monthlyPayment * 100)/100.0;
        totalPayment = (int)(totalPayment * 100)/100.0;
        //输出结果
        String output = "The monthly payment is " + monthlyPayment +"\nThe total payment is " + totalPayment;
        JOptionPane.showMessageDialog(null,output);
    }
}

package learnByBook.Chapter7.lesson0320.practice715;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

/**
 * Created by xin14.zhang on 2018/3/20.
 */
public class TestLoanClass {
    public static void main(String[] args) {
        String annualInterestRateString = JOptionPane.showInputDialog("Enter yearly interest rate,for example 8.25:");
        double annualInterestRate = Double.parseDouble(annualInterestRateString);
        String numberOfYearsString = JOptionPane.showInputDialog("Enter number of years as an integer,\nfor example5:");
        int numberOfYears = Integer.parseInt(numberOfYearsString);
        String loanString = JOptionPane.showInputDialog("Enter loan amount,for example 120000.95:");
        double loanAmount = Double.parseDouble(loanString);

        Loan loan = new Loan(annualInterestRate,numberOfYears,loanAmount);
        double monthlyPayment = (int)(loan.getMonthlyPayment()*100)/100.0;
        double totalPayment = (int)(loan.getTotalPayment()*100)/100.0;

        String output = "The loan was created on "+loan.getLoanDate().toString()+
                "\nThe monthly payment is "+ monthlyPayment+"\nThe total payment is "+totalPayment;
        JOptionPane.showMessageDialog(null,output);
    }
}

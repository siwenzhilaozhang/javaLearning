package learnByBook.Chapter11.lesson0421;

import learnByBook.Chapter7.lesson0320.practice715.Loan;

import javax.swing.*;

/**
 * Created by xin14.zhang on 2018/4/21.
 */
public class BorrowLoan {
    public static void main(String[] args) {
        Name name = new Name("John",'D',"Smith");
        Address address = new Address("100 Main Street","Savannah","GA","31419");
        Loan loan = new Loan(5.5,15,250000);
        Borrower borrower = new Borrower(name,address);
        borrower.setLoan(loan);
        JOptionPane.showMessageDialog(null,borrower.toString());
    }
}

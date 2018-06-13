package learnByBook.Chapter7.lesson0330.P703;

import java.util.Date;

/**
 * Created by xin14.zhang on 2018/3/30.
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated = new Date();

    public Account(){
        this(0,0,0);
    }
    public Account(int id,double balance,double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){this.id = id;}
    public double getBalance(){return balance;}
    public void setBalance(double balance){this.balance = balance;}
    public double getAnnualInterestRate(){return annualInterestRate;}
    public void setAnnualInterestRate(double annualInterestRate){this.annualInterestRate = annualInterestRate;}
    public Date getDateCreated(){return dateCreated;}

    public double getMonthlyInterestRate(){
        double monthlyInterestRate = annualInterestRate / 1200 *balance;
        return monthlyInterestRate;
    }
    public void withDraw(double loan){
        this.balance = balance - loan;
    }
    public void deposit(double loan){
        this.balance = balance+loan;
    }
}

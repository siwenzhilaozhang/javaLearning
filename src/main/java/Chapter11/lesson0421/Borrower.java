package Chapter11.lesson0421;

import Chapter7.lesson0320.practice715.Loan;

/**
 * Created by xin14.zhang on 2018/4/21.
 */
public class Borrower extends Person {
    private Loan loan;
    public Borrower(){
        super();
    }
    public Borrower(Name name,Address address){
        super(name,address);
    }
    public Loan getLoan(){
        return loan;
    }
    public void setLoan(Loan loan){
        this.loan = loan;
    }
    public String toString(){
        return super.toString()+"Monthly payment is "+loan.getMonthlyPayment()+'\n'+
                "Total payment is "+loan.getTotalPayment();
    }
}

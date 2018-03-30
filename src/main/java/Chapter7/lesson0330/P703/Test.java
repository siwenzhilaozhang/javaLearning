package Chapter7.lesson0330.P703;

/**
 * Created by xin14.zhang on 2018/3/30.
 */
public class Test {
    public static void main(String[] args) {
        Account account = new Account(1122,20000,4.5);
//        account = new Account();
        account.withDraw(2500);
        account.deposit(3000);
        System.out.println("余额为："+account.getBalance()+",月利率为"+account.getMonthlyInterestRate()+",开户日期为"+account.getDateCreated());

        Account account1[] = new Account[10];
        Account account2 = new Account();
        for(int i = 0;i<account1.length;i++){
            account1[i]=account2;
        }

    }
}

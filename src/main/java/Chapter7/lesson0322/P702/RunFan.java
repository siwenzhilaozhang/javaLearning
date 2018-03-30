package Chapter7.lesson0322.P702;

/**
 * Created by xin14.zhang on 2018/3/30.
 */
public class RunFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan(Fan.FASH,10,"yellow",true);
        Fan fan2 = new Fan(Fan.MEDIUM,5,"blue",false);
        System.out.print("fan1 is: ");fan1.toString(true);
        System.out.println();
        System.out.print("fan2 is: ");fan2.toString(false);
    }
}
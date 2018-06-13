package learnByBook.Chapter3.lesson0210;

/**
 * Created by xin14.zhang on 2018/2/10.
 */
/* 读入一个整数并检查它是不是偶数*/
import javax.swing.JOptionPane;

public class P32 {
    public static void main(String[] args){
        String inputString = JOptionPane.showInputDialog("请输入一个整数：");
        int input = Integer.parseInt(inputString);
        boolean isEven = input%2==0;
        String output = "Is " + input + " an even number ? " + isEven;
        JOptionPane.showMessageDialog(null,output);
    }
}

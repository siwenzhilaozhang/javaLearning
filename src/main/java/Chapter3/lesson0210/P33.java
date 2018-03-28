package Chapter3.lesson0210;

/**
 * Created by xin14.zhang on 2018/2/10.
 */
/* 用户输入，检测该输入是否能被5和6同时整除。至少能被5或6整除。仅能被5或6整除*/
import javax.swing.JOptionPane;
public class P33 {
    public static void main(String[] args){
        String inputString = JOptionPane.showInputDialog("请输入一个整数");
        int input = Integer.parseInt(inputString);
        String output1 = "Is " + input + "divisible by 5 and 6 ?" + ((input%5==0)&&(input%6==0));
        String output2 = "Is " + input + "divisible by 5 or 6 ?" + ((input%5==0)||(input%6==0));
        String output3 = "Is " + input + "divisible by 5 or 6,but not both ?" + ((input%5==0)^(input%6==0));
//        JOptionPane.showMessageDialog(null,output1);
//        JOptionPane.showMessageDialog(null,output2);
//        JOptionPane.showMessageDialog(null,output3);
        JOptionPane.showMessageDialog(null,output1+"\n"+output2+"\n"+output3);
    }
}

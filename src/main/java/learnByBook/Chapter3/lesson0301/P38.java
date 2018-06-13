package learnByBook.Chapter3.lesson0301;

/**
 * Created by xin14.zhang on 2018/3/1.
 */
//输入三位整数，排序，实现num1<=num2<=num3；
import javax.swing.JOptionPane;

public class P38 {
    public static void main(String[] args){
        //输入三位整数
        String num1String = JOptionPane.showInputDialog("请输入整数num1 ");
        int num1 = Integer.parseInt(num1String);
        String num2String = JOptionPane.showInputDialog("请输入整数num2 ");
        int num2 = Integer.parseInt(num2String);
        String num3String = JOptionPane.showInputDialog("请输入整数num3 ");
        int num3 = Integer.parseInt(num3String);
        //排序
        if(num1>num2){
            int num=num2;
            num2=num1;
            num1=num;
        }
        if (num3 < num2){
            if (num3 < num1) {
                int num=num2;
                num2=num1;
                num1=num3;
                num3=num;
            }
            else{
                int num=num2;
                num2=num3;
                num3=num;
            }
        }
        String output = "num1= " + num1  + ",num2= " + num2 + ",num3= " + num3;
        JOptionPane.showMessageDialog(null,output);
    }
}

/*
* 注1：在计算3的排序时，3应该和2和1均去比较，且有1<3<2和3<1<2两种可能
* 注2：在3<1<2时，换3个数字的排序时，只需定义一个中间变量
* 注3：在交换顺序时，设置中间变量，要最后赋值给对应的变量，不然会错
* */

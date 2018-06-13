package learnByHanshunping.learn0613;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

//该程序可接收两个数（可以是整数，也可以是小数），并判断两个数是大于？小于？等于
public class Lesson0302 {
    public static void main(String[] args) {
        try {
            //输入流，从键盘接收数
            InputStreamReader isr = new InputStreamReader(System.in);  //System.in为标准输入
            BufferedReader br = new BufferedReader(isr);
            //给出提示
            System.out.println("请输入第一个数");
            //从控制台读取一行数据
            String a1 = br.readLine();
            System.out.println("请输入第二个数");
            String a2 = br.readLine();
            //把string转为float
            float num1 = Float.parseFloat(a1);
            float num2 = Float.parseFloat(a2);
            if (num1 > num2) System.out.println("第一个大");
            if (num1 == num2) System.out.println("相等");
            if (num1 < num2) System.out.println("第二个大");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

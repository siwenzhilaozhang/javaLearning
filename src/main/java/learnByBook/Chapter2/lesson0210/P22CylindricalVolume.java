package learnByBook.Chapter2.lesson0210;

/**
 * Created by xin14.zhang on 2018/2/10.
 */
/* 2.2 （计算圆柱的体积）程序读入圆柱的半径和高，计算体积
        面积=半径*半径*PI
        体积=面积*高
  */
import javax.swing.JOptionPane;

public class P22CylindricalVolume {
    public static void main(String[] args){
        final double PI = 3.14;
        String radiusString = JOptionPane.showInputDialog("请输入圆柱的半径，注意为正整数：");
        int radius = Integer.parseInt(radiusString);
        String heightString = JOptionPane.showInputDialog("请输入圆柱的高，注意为正整数：");
        int height = Integer.parseInt(heightString);

        double area = radius * radius * PI;
        double volume = area * height;
        volume = volume * 100 / 100;

        String output = "半径为" + radius + ",高为" + height + "的圆柱的体积为" + volume;
        JOptionPane.showMessageDialog(null,output);
    }
}

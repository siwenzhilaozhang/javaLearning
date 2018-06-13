package learnByBook.Chapter3.lesson0210;

/**
 * Created by xin14.zhang on 2018/2/10.
 */
/* 读入三角形的三条边并确定输入是否有效。如果任意两条边的和大于第三条边则输入有效 */
import javax.swing.JOptionPane;
public class P31 {
    public static void main(String[] args){
        //输入三角形三条边
        String edge1String = JOptionPane.showInputDialog("please input edge1");
        int edge1 = Integer.parseInt(edge1String);
        String edge2String = JOptionPane.showInputDialog("please input edge2");
        int edge2 = Integer.parseInt(edge2String);
        String edge3String = JOptionPane.showInputDialog("please input edge3");
        int edge3 = Integer.parseInt(edge3String);
        //判断输入是否有效
        boolean isEffective = ((edge1+edge2)>edge3)&&((edge1+edge3)>edge2)&&((edge2+edge3)>edge1);
        String output = "Can edges " + edge1 + "," + edge2 + ", and" + edge3 + " form a triangle ? " + isEffective;
        JOptionPane.showMessageDialog(null,output);
    }
}

package learnByBook.Chapter3.lesson0301;

import javax.swing.*;

/**
 * Created by xin14.zhang on 2018/3/1.
 */
//输入三角形三条边，若输入正确，则计算周长，若输入错误，则输出输入错误
public class P39 {
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
        //计算周长
        String output;
        if(isEffective){
            int Long = edge1 + edge2 + edge3;
            output = "三角形的周长为" + Long;
        }
        else output = "输入无效";
        JOptionPane.showMessageDialog(null,output);
    }
    }

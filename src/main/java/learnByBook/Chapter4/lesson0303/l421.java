package learnByBook.Chapter4.lesson0303;

import javax.swing.*;

/**
 * Created by xin14.zhang on 2018/3/3.
 */
public class l421 {
    public static void main(String[] args) {
        int option = 0;
        while(option == JOptionPane.YES_OPTION){
            System.out.println("continue loop");
            option = JOptionPane.showConfirmDialog(null,"continue?");
        }
    }
}

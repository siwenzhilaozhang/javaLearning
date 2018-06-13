package learnByBook.Chapter17.lesson0422;

import java.util.Scanner;

/**
 * Created by xin14.zhang on 2018/4/22.
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println("The number entered is "+number);
    }
}

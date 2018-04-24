package Chapter17.lesson0422;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by xin14.zhang on 2018/4/22.
 */
public class HandleExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueInput = true;
        do{
            try{
                System.out.print("Enter an integer: ");
                int number = scanner.nextInt();
                System.out.println("The number entered is "+number);
                continueInput = false;
            }
            catch (InputMismatchException ex){
                System.out.println("Try again. (Incorrect input:an integer is required)");
                scanner.nextLine();
            }
        }
        while(continueInput);
    }
}

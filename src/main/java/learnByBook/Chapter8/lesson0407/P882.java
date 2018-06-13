package learnByBook.Chapter8.lesson0407;

import java.io.File;
import java.util.Scanner;

/**
 * Created by xin14.zhang on 2018/4/7.
 */
public class P882 {
    public static void main(String[] args) throws Exception {
        File file = new File("score.txt");
        Scanner input = new Scanner(file);
        while(input.hasNext()){
            String firstName = input.next();
            String mi = input.next();
            String lastName = input.next();
            int score = input.nextInt();
            System.out.println(firstName+" "+mi+" "+lastName+" "+score);
        }
        input.close();
    }
}

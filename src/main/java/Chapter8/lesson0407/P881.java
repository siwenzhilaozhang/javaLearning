package Chapter8.lesson0407;

import java.io.File;
import java.io.PrintWriter;

/**
 * Created by xin14.zhang on 2018/4/7.
 */
public class P881 {
    public static void main(String[] args) throws Exception {
        File file = new File("score.txt");
        if(file.exists()){
            System.out.println("File already exists");;
            System.exit(0);
        }
        PrintWriter output = new PrintWriter(file);
        output.print("John T Smith ");
        output.println(90);
        output.print("Eric K Jones ");
        output.println(85);
        output.close();
        System.out.println(file.getAbsolutePath());
    }
}

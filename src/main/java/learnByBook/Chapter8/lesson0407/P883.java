package learnByBook.Chapter8.lesson0407;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by xin14.zhang on 2018/4/7.
 */
public class P883 {
    public static void main(String[] args) throws Exception {
        if(args.length !=4){
            System.out.println("Usage:java P883 sorceFile targetFile oldStr newStr");
            System.exit(0);
        }
        File sourceFile = new File(args[0]);
        if(!sourceFile.exists()){
            System.out.println("Source file "+args[0]+" does not exist");
            System.exit(0);
        }
        File targetFile = new File(args[1]);
        if(targetFile.exists()){
            System.out.println("Target file "+args[1]+" already exists");
            System.exit(0);
        }
        Scanner input = new Scanner(sourceFile);
        PrintWriter output = new PrintWriter(targetFile);
        while(input.hasNext()){
            String s1 = input.nextLine();
            String s2 = s1.replaceAll(args[2],args[3]);
            output.println(s2);
        }
        input.close();
        output.close();
    }
}

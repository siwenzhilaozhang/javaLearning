package learnByBook.Chapter8.lesson0407;

import java.io.File;
import java.util.Date;

/**
 * Created by xin14.zhang on 2018/4/7.
 */
public class P870 {
    public static void main(String[] args) {
        File file = new File("image/us.gif");
        System.out.println("Does it exist? "+file.exists());
        System.out.println("Can it be read? "+file.canRead());
        System.out.println("Can it be written? "+file.canWrite());
        System.out.println("Is it a directory? "+file.isDirectory());
        System.out.println("Is it a File? "+file.isFile());
        System.out.println("Is it absolute? "+file.isAbsolute());
        System.out.println("Is it hidden? "+file.isHidden());
        System.out.println("Absolute path is "+file.getAbsolutePath());
        System.out.println("Last modified on "+new Date(file.lastModified()));
    }
}

package Chapter8.lesson0330;

/**
 * Created by xin14.zhang on 2018/3/30.
 */
//字符串类String
public class P802 {
    public static void main(String[] args) {
        String message = new String("Welcome to java");
        String message1 = "Welcome to java";
        char[] charArray = {'G','O','O','D',' ','D','A','Y'};
        String message2 = new String(charArray);

        String s = "Welcome to java";
        String s1 = new String("Welcome to java");
        String s2 = s1.intern();
        String s3 = "Welcome to java";
        System.out.println("s1 == s is "+(s1==s));
        System.out.println("s2 == s is "+(s2==s));
        System.out.println("s == s3 is "+(s==s3));

        if(s1==s2)System.out.println("s1 and s2 are the same object");
        else System.out.println("s1 and s2 are different object");
        if(s1.equals(s2))System.out.println("s1 and s2 are the same object");
        else System.out.println("s1 and s2 are different object");
        s1.compareTo(s2);

        s.charAt(3);
        "Welcome to java".charAt(3);
        String s5 ="welcome to java".substring(1,3) ;

        String s4 = s1+s2;

        System.out.println("Welcome".toLowerCase());
        System.out.println("Welcome".toUpperCase());
        System.out.println("  Welcome ".trim());
        System.out.println("Welcome".replace('e','A'));
        System.out.println("Welcome".replaceFirst("e","A"));
        System.out.println("Welcome".replaceAll("e","A"));

        System.out.println("Welcome to java");
        System.out.println("Welcome to java".indexOf('W'));
        System.out.println("Welcome to java".indexOf('o',5));
        System.out.println("Welcome to java".indexOf("come"));
        System.out.println("Welcome to java".indexOf("come",5));
        System.out.println("Welcome to java".lastIndexOf('W'));
        System.out.println("Welcome to java".lastIndexOf('o',5));

        char[] chars = "JAVA".toCharArray();
        char[] dst={'J','A','V','A','1','3','0','1'};
        "cs3720".getChars(2,6,dst,4);
        String str = new String(new char[]{'j','a','v','a'});
        String str1 = String.valueOf(new char[]{'j','a','v','a'});
    }
}

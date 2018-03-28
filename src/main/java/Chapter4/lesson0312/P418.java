package Chapter4.lesson0312;

/**
 * Created by xin14.zhang on 2018/3/12.
 */
public class P418 {
    public static void main(String[] args){
        patternI(6);
        patternII(6);
        patternIII(6);
        patternIV(6);
    };
    public static void patternI(int i){
        System.out.println("Pattern I");
        for(int n=1;n<=i;n++){
            for(int j=1;j<=n;j++){
             System.out.print(j);
            }
         System.out.println();}}
    public static void patternII(int i){
        System.out.println("Pattern II");
        for(int n=i;n>=1;n--){
            for(int j=1;j<=n;j++){
                System.out.print(j);
            }
         System.out.println();
        }
    }
    public static void patternIII(int i){
        System.out.println("Pattern III");
        for(int n=1;n<=i;n++){
            for(int j=1;j<=(i-n);j++)System.out.print(" ");
            for(int j=1;j<=n;j++)System.out.print(j);
            System.out.println();
        }
    }
    public static void patternIV(int i){
        System.out.println("Pattern IV");
        for(int n=i;n>=1;n--){
            for(int j=1;j<=(i-n);j++)System.out.print(" ");
            for(int j=1;j<=n;j++)System.out.print(j);
            System.out.println();
        }
    }
        }
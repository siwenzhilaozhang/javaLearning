package Chapter4.lesson0312;

/**
 * Created by xin14.zhang on 2018/3/12.
 */
public class P419 {
    public static void main(String[] args){
        for(int i=0;i<=7;i++){
            for(int j=0;j<7-i;j++)System.out.print("     ");
            for(int j=0;j<=i;j++){
                if((int)Math.pow(2,j)>=100)System.out.print("  "+(int)Math.pow(2,j));
                else if((int)Math.pow(2,j)>=10)System.out.print("   "+(int)Math.pow(2,j));
                else System.out.print("    "+(int)Math.pow(2,j));
            };
            for(int j=i-1;j>=0;j--){
                if((int)Math.pow(2,j)>=100)System.out.print("  "+(int)Math.pow(2,j));
                else if((int)Math.pow(2,j)>=10)System.out.print("   "+(int)Math.pow(2,j));
                else System.out.print("    "+(int)Math.pow(2,j));
            }
            System.out.println();
        }
    }
}

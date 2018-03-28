package Chapter4.lesson0303;

/**
 * Created by xin14.zhang on 2018/3/3.
 * 错误，不会
 */
public class l492 {
    public static void main(String[] args) {
        int count = 0;
        for (int num = 2; count < 50; num++) {
            boolean ifss = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    ifss = false;
                    break;
                }
            }
            if(ifss) {
                System.out.print(num + "  ");
                count++;
                if (count % 10 == 0) System.out.println();
            }
        }
    }
}

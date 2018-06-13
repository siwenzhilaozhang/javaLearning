package learnByBook.Chapter4.lesson0303;

/**
 * Created by xin14.zhang on 2018/3/3.
 */
//void方法的调用
public class l54 {
    public static void main(String[] args){
        printGrade(99);
    }
    public static void printGrade(double score){
        if(score<0||score>100) {
            System.out.println("invalid score");
            return;
        }
        if(score>=90) System.out.println('A');
        else if(score>=80) System.out.println('B');
        else if(score>=70) System.out.println('C');
        else if(score>=60) System.out.println('D');
        else System.out.println('F');
    }
}

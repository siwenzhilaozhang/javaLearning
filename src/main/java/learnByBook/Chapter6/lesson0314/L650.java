package learnByBook.Chapter6.lesson0314;

import java.util.Random;

/**
 * Created by xin14.zhang on 2018/3/14.
 */
//从方法中返回数组
public class L650 {
    public static void main(String args[]){
        char[] chars = createArray();
        System.out.println("The lowercase letters are:");
        displayArray(chars);
        int[] counts = countLetters(chars);
        System.out.println();
        System.out.println("The occurrences of each letter are:");
        displayCounts(counts);
    }
    //生成随机字母
    public static char[] createArray(){
        char[] chars = new char[100];
        for(int i=0;i<chars.length;i++)chars[i]=getRandomLowerCaseLetter();
        return chars;
    }
    public static char getRandomLowerCaseLetter(){
        return getRandomCharacter('a','z');
    }
    public static char getRandomCharacter(char ch1,char ch2){
        return (char)(ch1+Math.random()*(ch2-ch1+1));
    }
    //输出数组
    public static void displayArray(char[] chars){
        for(int i=0;i<chars.length;i++){
            if((i+1)%20==0)System.out.println((chars[i]+" "));
            else System.out.print((chars[i]+" "));
        }
    }
    //计算出现次数
    public static int[] countLetters(char[] chars){
        int[] counts = new int[26];
        for(int i=0;i<chars.length;i++)counts[chars[i]-'a']++;    //此法注意，数组转换为出现次数
        return counts;
    }
    //计算每个字母出现总次数
    public static void displayCounts(int[] counts){
        for(int i=0;i<counts.length;i++){
            if((i+1)%10==0)System.out.println(counts[i]+" "+(char)(i+'a'));
            else System.out.print(counts[i]+" "+(char)(i+'a')+" ");
        }
    }
}

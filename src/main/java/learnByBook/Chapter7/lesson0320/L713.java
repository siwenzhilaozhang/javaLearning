package learnByBook.Chapter7.lesson0320;

import learnByBook.Chapter7.Circle3;

/**
 * Created by xin14.zhang on 2018/3/20.
 */
//对象数组
public class L713 {
    public static void main(String[] args) {
        Circle3[] circleArray = createCircleArray();
        printCircleArray(circleArray);
    }
    public static Circle3[] createCircleArray(){
        Circle3[] circleArray = new Circle3[10];
        for(int i=0;i<circleArray.length;i++){
            circleArray[i]=new Circle3(Math.random()*100);
        }
        return circleArray;
    }
    public static void printCircleArray(Circle3[] circleArray){
        System.out.println("Radius\t\t\t\t"+"Area");
        for(int i=0;i<circleArray.length;i++){
            System.out.print(circleArray[i].getRadius()+"\t\t"+circleArray[i].getArea()+'\n');
        }
        System.out.println("---------------");
        System.out.println("The total areas of circles is \t"+sum(circleArray));
    }
    public static double sum(Circle3[] circleArray){
        double sum=0;
        for(int i=0;i<circleArray.length;i++){
            sum+=circleArray[i].getArea();
        }
        return sum;
    }
}
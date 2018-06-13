package learnByBook.Chapter2.lesson0201;

/**
 * Created by xin14.zhang on 2018/2/1.
 */
//本例错误原因：不熟悉string short double等数据类型。
public class ComputerArea {
    public static void main(String[] args){
/*      int r = "5";
        short pai="3.14";
        short S;
        System.out.println(S=pai*(short)r);*/
        double radius;
        double area;
        radius=5;
        area=radius*radius*3.14;
        System.out.println("The area for the circle of radius "+radius+" is "+area);
        System.out.println(area=radius*radius*3.14);

        //常量的使用,常量一般全用大写字母
        final double PI=3.14;
        System.out.println(area=radius*radius*PI);

    }
}

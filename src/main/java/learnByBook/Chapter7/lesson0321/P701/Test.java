package learnByBook.Chapter7.lesson0321.P701;

/**
 * Created by xin14.zhang on 2018/3/21.
 */
public class Test {
    public static void main(String[] args) {
        Rectangle test1 = new Rectangle(4,40);
        Rectangle test2 = new Rectangle(3.5,35.9);
        test1.setColor("red");
        test2.setColor("red");
        String output1 = "test1 的宽为"+test1.getWidth()+",高为"+test1.getHeigh()+",颜色为"+test1.getColor()+
                ",面积为"+test1.getArea()+",周长为"+test1.getPerimeter();
        String output2 = "test2 的宽为"+test2.getWidth()+",高为"+test2.getHeigh()+",颜色为"+test2.getColor()+
                ",面积为"+test2.getArea()+",周长为"+test2.getPerimeter();
        System.out.print(output1+"\n"+output2);
    }
}

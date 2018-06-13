package learnByBook.Chapter2.Lesson0131;

/**
 * Created by xin14.zhang on 2018/1/31.
 */
//变量的赋值  2.5章
public class Lesson0131 {
    public static void main(String[] args)
    {
        String hobby = "慕课网";
        System.out.println(hobby);

        String love = "imooc";
        System.out.println("变量love的内容是："+love);
        love = "I love 慕课网";
        System.out.println("重新赋值后的love的内容是："+love);

        String imooc = "我爱慕课网";
        String _imooc = "www.imooc.com";
        String $imooc = "我要学java";
        System.out.println(imooc+_imooc+$imooc);
    }
}

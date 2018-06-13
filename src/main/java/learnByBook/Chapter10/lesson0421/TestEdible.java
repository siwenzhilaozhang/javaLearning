package learnByBook.Chapter10.lesson0421;

import learnByBook.Chapter10.lesson0419.Edible;

/**
 * Created by xin14.zhang on 2018/4/21.
 */
public class TestEdible {
    public static void main(String[] args) {
        Object[] objects = {new Tiger(),new Chicken(),new Apple()};
        for(int i=0;i<objects.length;i++) showObject(objects[i]);
    }
    public static void showObject(Object object){
        if(object instanceof Edible)
            System.out.println(((Edible)object).howToEat());
    }
}

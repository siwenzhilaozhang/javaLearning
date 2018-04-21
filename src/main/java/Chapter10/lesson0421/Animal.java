package Chapter10.lesson0421;

import Chapter10.lesson0419.Comparable;
import Chapter10.lesson0419.Edible;

/**
 * Created by xin14.zhang on 2018/4/21.
 */
public class Animal {
}

class Chicken extends Animal implements Edible,Comparable{
    int weight;
    public Chicken(){}
    public Chicken(int weight){
        this.weight = weight;
    }
    public String howToEat(){
        return "Fry it";
    }
    public int compareTo(Object o){
        return weight-((Chicken)o).weight;
    }
}

class Tiger extends Animal{}

abstract class Fruit implements Edible{}
class Apple extends Fruit{
    public String howToEat(){
        return "Make apple cider";
    }
}
class Orange extends Fruit{
    public String howToEat(){
        return "Make orange juice";
    }
}
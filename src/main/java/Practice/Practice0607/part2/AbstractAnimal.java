package Practice.Practice0607.part2;

//定义动物接口，有一个动作叫睡觉，所有的动物都会睡觉（输出，sleep），每个动物睡觉前都会有其特有动作。现在有两种动物，人，睡前动作是走路walk，猫睡前动作是run。测试函数输出人和猫睡前动作。
//需要接口也需要抽象类
public abstract class AbstractAnimal implements Animal {

    public void sleep(){
        actionBeforeSleep();//模板方法模式
        System.out.println("sleep");
    }

    public abstract void actionBeforeSleep();
}

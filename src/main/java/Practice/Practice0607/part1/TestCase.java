package Practice.Practice0607.part1;

public class TestCase {
    public static void main(String[] args) {
        Human human = new Human();
        Cat cat = new Cat();
        human.actionBeforeSleep();
        human.sleep();
        cat.actionBeforeSleep();
        cat.sleep();
    }
}

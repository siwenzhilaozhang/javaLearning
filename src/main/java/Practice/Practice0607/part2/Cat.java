package Practice.Practice0607.part2;

public class Cat extends AbstractAnimal {
    public void actionBeforeSleep() {
        System.out.println("run.");
    }

    public static void main(String[] args) {
        Animal animal = new Human();
        animal.sleep();
        animal = new Cat();
        animal.sleep();
    }
}

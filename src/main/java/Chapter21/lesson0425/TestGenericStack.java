package Chapter21.lesson0425;

/**
 * Created by xin14.zhang on 2018/4/25.
 */
public class TestGenericStack {
    public static void main(String[] args) {
        GenericStack<String> stack1 = new GenericStack<String>();
        stack1.push("London");
        stack1.push("Paris");
        stack1.push("Berlin");

        GenericStack<Integer> stack2 = new GenericStack<Integer>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
    }
}

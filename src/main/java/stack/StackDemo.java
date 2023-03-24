package stack;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack<String> kitchenDrawer = new Stack<>();

        kitchenDrawer.push("Pan");
        kitchenDrawer.push("Dish");
        kitchenDrawer.push("Fork");

        System.out.println(kitchenDrawer);
        System.out.println("Taking top element");
        System.out.println(kitchenDrawer.pop());
        System.out.println("Seeing whats left");
        System.out.println(kitchenDrawer);

        kitchenDrawer.add(1, "Towel"); //not a normal stack operation. This is list operation!!!

        System.out.println(kitchenDrawer);
    }
}

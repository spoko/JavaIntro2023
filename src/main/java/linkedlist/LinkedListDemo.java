package linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();
        cars.add("BMW");
        cars.add(0, "Mercedes");
        cars.add("Audi");

        System.out.println("All elements are: " + cars);

        cars.remove("Audi");
        cars.remove(1);

        System.out.println("After remove elements are: " + cars);
    }
}

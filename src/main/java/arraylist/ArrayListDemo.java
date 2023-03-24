package arraylist;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Sofia");
        cities.add(0, "Plovdiv");
        cities.add("Burgas");

        System.out.println(cities);

        System.out.printf("Sofia is at position: %d\n", cities.indexOf("Sofia") + 1);

        cities.remove(0);
        System.out.println(cities);

        cities.remove("Blah");
        System.out.println(cities);

        System.out.printf("Sofia is at position: %d\n", cities.indexOf("Sofia") + 1);

        cities.clear();
        System.out.println(cities);
    }
}

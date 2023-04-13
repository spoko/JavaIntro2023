package mathDemo;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random rn = new Random();
        System.out.println((rn.nextInt(0, 150)));
    }
}

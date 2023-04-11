package access2;

import access.Product;

public class Test {
    public static void main(String[] args) {
        Product pr2 = new Product();
        System.out.println(pr2.publicName);

        pr2.publicMethod();
    }
}

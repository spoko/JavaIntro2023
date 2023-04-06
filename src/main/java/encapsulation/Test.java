package encapsulation;

public class Test {
    public static void main(String[] args) {
        Person elena = new Person("Elena", 11);
        Person alex = new Person("Alex", 4);

        Product coffee = new Product("Coffee", 10);
        Product tea = new Product("Tea", 2);

        elena.buyProduct(coffee);
        alex.buyProduct(tea);
        alex.buyProduct(tea);
        elena.buyProduct(tea);

        elena.printItemsFromTheBag();
        alex.printItemsFromTheBag();
    }
}

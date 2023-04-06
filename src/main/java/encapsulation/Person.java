package encapsulation;

import java.util.LinkedList;

public class Person {
    private String name;
    private int money;
    private LinkedList<Product> bagOfProducts = new LinkedList<Product>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.isEmpty()){
            this.name = name;
        }else {
            System.out.println("Person name cannot be empty");
        }

    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if (money >= 0){
            this.money = money;
        }else {
            System.out.println("Person money cannot be negative");
        }
    }

    public Person(String name, int money) {
        setName(name);
        setMoney(money);
    }

    public void buyProduct(Product product){
        if (this.getMoney() >= product.getCost()){
            bagOfProducts.add(product);
            this.setMoney(this.getMoney() - product.getCost());
            System.out.printf("%s bought %s\n", this.getName(), product.getName());
        }else {
            System.out.printf("%s can't afford %s\n", this.getName(), product.getName());
        }
    }

    public void printItemsFromTheBag(){
        if (bagOfProducts.size() == 0){
            System.out.printf("%s - Nothing bought\n", this.getName());
            return;
        }

        String itemNames = "";
        for (Product product : bagOfProducts){
            itemNames += product.getName();
        }

        System.out.printf("%s - %s\n", this.getName(), itemNames);
    }
}

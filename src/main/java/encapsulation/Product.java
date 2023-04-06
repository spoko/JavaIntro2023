package encapsulation;

public class Product {
    private String name;
    private int cost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }else{
            System.out.println("Product name cannot be empty");
        }
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        if (cost >= 0){
            this.cost = cost;
        }else {
            System.out.println("Money cannot be negative");
        }
    }

    public Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
}

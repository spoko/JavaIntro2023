package oop;

public class Test {

    public static void main(String[] args) {
        //creating the first object from class Dog using constructor
        Dog morti = new Dog("french bulldog", "male", 15.4f, "Morti", (byte) 2,
                "brown", false);
        //calling some actions that available for the object
        morti.bark();
        morti.eat();
        //creating new object from class Dog
        Dog sharka = new Dog("Husky", "female", 35.6f, "Sharka", (byte) 5,
                "white", true);
        sharka.setWeight(33.0f);
        sharka.setAge((byte) 6);
        //sharo.setBreed("new sharo"); -- cannot be accessed

        Parrot patchi = new Parrot("Ara", "male", 2.0f, "Patchi", (byte) 20,
                "Colorful", true);

        patchi.eat();
    }
}

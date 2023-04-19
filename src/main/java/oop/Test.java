package oop;

public class Test {

    public static void main(String[] args) {

        //AbstractDemo absd = new AbstractDemo(); //we cannot have instance (object) from an abstract class = abstract class cannot be instanced
        //creating the first object from class Dog using constructor
        Dog morti = new Dog(new Breed("French Bulldog", "lazy, farts, snoring",
                "quite a few..."),
                "male", 15.4f, "Morti", (byte) 2,
                "brown", false);
        //calling some actions that available for the object
        morti.bark();
        morti.eat();
        morti.setAddress(new Address("Sofia", "Bulgaria", "Levski G..."));
        //creating new object from class Dog
        Breed huskyBreed = new Breed("Husky", "Love snow", "Overheating");
        Dog sharka = new Dog(huskyBreed, "female", 35.6f, "Sharka", (byte) 5,
                "white", true);
        sharka.setWeight(33.0f);
        sharka.setAge((byte) 6);
        //sharo.setBreed("new sharo"); -- cannot be accessed

        Parrot patchi = new Parrot(new Breed("Ara", "", ""), "male", 2.0f, "Patchi", (byte) 20,
                "Colorful", true);

        patchi.eat();
        patchi.equals(sharka);//equal method is from Object class
        Dog dog2 = new Dog("Sharo");

        Dog dog3 = getADog();
    }

    //factory method
    public static Dog getADog(){
        return new Dog();
    }
}

package oop;

public class Dog extends Pet {

    private boolean hasTail;

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public Dog(String breed, String sex, float weight, String name, byte age, String color, boolean hasTail) {
        super(breed, sex, weight, name, age, color); //calling the constructor of the parent class
        setHasTail(hasTail);
    }

    //method - actions that any future objects that will be created can do
    public void bark(){
        System.out.println(super.getName() + " is barking!");//super is accessing stuff from the parent class
    }
}

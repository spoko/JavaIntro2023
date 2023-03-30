package oop;

public class Parrot extends Pet {

    private boolean hasLongBeak;

    public boolean isHasLongBeak() {
        return hasLongBeak;
    }

    public void setHasLongBeak(boolean hasLongBeak) {
        this.hasLongBeak = hasLongBeak;
    }

    public Parrot(Breed breed, String sex, float weight, String name, byte age, String color, boolean hasLongBeak) {
        super(breed, sex, weight, name, age, color);
        setHasLongBeak(hasLongBeak);
    }

    //first different method/ action
    public void speaks(){
        System.out.println(super.getName() + " is singing!");
    }

    //method override - polymorphism:
    public void run(){
        System.out.println(super.getName() + " is flying...");
    }

    public void repeatTheWord(){
        System.out.println("Repeating...");
    }
}

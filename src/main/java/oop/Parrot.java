package oop;

public class Parrot extends Pet {

    private boolean hasLongBeak;

    public boolean isHasLongBeak() {
        return hasLongBeak;
    }

    public void setHasLongBeak(boolean hasLongBeak) {
        this.hasLongBeak = hasLongBeak;
    }

    public Parrot(String breed, String sex, float weight, String name, byte age, String color, boolean hasLongBeak) {
        super(breed, sex, weight, name, age, color);
        setHasLongBeak(hasLongBeak);
    }

    //first different method/ action
    public void speaks(){
        System.out.println(super.getName() + " is singing!");
    }
}

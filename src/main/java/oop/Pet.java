package oop;

public class Pet implements PetActions {
    //instance variable - characteristics of any future object that will be created
    private String breed;
    private String sex;
    private float weight;
    private String name;
    private byte age;
    private String color;

    //setters and getters
    public String getBreed() {
        return breed;
    }

    //limited the possibility to be change only internally - in this case only using the constructor
    private void setBreed(String breed) {
        if (!breed.isEmpty()){
            this.breed = breed;
        }else {
            System.out.println("Error: breed is mandatory");
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (!sex.isEmpty()){
            this.sex = sex;
        }else {
            System.out.println("Error: sex is mandatory");
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight > 0){
            this.weight = weight;
        }else {
            System.out.println("Error: invalid wight");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }else {
            System.out.println("Error: name is mandatory");
        }
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        if(age >= 0){
            this.age = age;
        }else {
            System.out.println("Error: invalid age");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (!color.isEmpty()){
            this.color = color;
        }else {
            System.out.println("Error: color is mandatory");
        }

    }

    //constructor
    public Pet(String breed, String sex, float weight, String name, byte age, String color){
        setBreed(breed);
        setSex(sex);
        setWeight(weight);
        setName(name);
        setAge(age);
        setColor(color);
    }

    //method - actions that any future objects that will be created can do
    public void eat(){
        System.out.println(this.name + " is eating!");
    }

    //poly
    @Override
    public void run() {
        System.out.println(this.name + " is running...");
    }

    @Override
    public void speak() {
        System.out.println(this.name + " is speaking...");
    }
}

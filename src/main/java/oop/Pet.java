package oop;

public class Pet extends AbstractDemo {
    //instance variable - characteristics of any future object that will be created
    private Breed breed;//composition
    private String sex;
    private float weight;
    private String name;
    private byte age;
    private String color;
    private Address address; //aggregation

    //setters and getters
    public Breed getBreed() {
        return breed;
    }

    //limited the possibility to be change only internally - in this case only using the constructor
    private void setBreed(Breed breed) {
        if (!breed.equals(null)){
            this.breed = breed;
        }else {
            System.out.println("Error: breed is mandatory");
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String enteredSex) {
        if (!enteredSex.isEmpty()){
            sex = enteredSex;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setColor(String color) {
        if (!color.isEmpty()){
            this.color = color;
        }else {
            System.out.println("Error: color is mandatory");
        }
    }

    //constructor
    public Pet(Breed breed, String sex, float weight, String name, byte age, String color){
        //this.breed = breed;
        setBreed(breed);
        setSex(sex);
        setWeight(weight);
        setName(name);
        setAge(age);
        setColor(color);
    }

    public Pet(String name){
        super(name);//
        setName(name);
    }

    //default constructor
    public Pet(){

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

    @Override
    public void sleep() {

    }

    @Override
    public void repeatTheWord() {

    }
}

package data.types;

public class Dog {
    //instance variables
    String sex;
    boolean isMale;
    String name;
    byte age;
    //static variable
    static boolean isGoodDog;

    public void printData(){
        System.out.println("Sex is: " + sex);
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
    }
}

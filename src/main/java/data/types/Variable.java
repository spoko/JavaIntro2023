package data.types;

public class Variable {
    //primitive data type - they are stored in the Stack memory:
    char symbol = 'Л';
    byte age = 100;
    short mountingPeaksHeight;
    int egn;
    long marsPeaksHeight;
    float weight;
    double bankBalance;


    //referent data types - they are stored in the Heap memory:
    static String someString = "some String Example - ^&%%$R";
    static String someStr2;
        //Object same as above


    public static void main(String[] args) {
        //local variable - must be initialized
        Dog.isGoodDog = true;
        Dog frenchBulldog = new Dog();
        String localVariable = "test";

        System.out.println(someString);
        System.out.println(someStr2);
        System.out.println(frenchBulldog);

        //not the usual way to use this variable (static one)
        System.out.println(frenchBulldog.isGoodDog);

        //printing default values for properties of the object frenchBulldog:
        System.out.println("printing default values for properties of the object frenchBulldog:");
        System.out.println(frenchBulldog.name);
        System.out.println(frenchBulldog.sex);
        System.out.println(frenchBulldog.age);
        System.out.println(frenchBulldog.isMale);

        //changing default values
        System.out.println("changing default values");
        frenchBulldog.name = "Morti";
        frenchBulldog.sex = "Male";
        frenchBulldog.age = 2;
        frenchBulldog.isMale = true;

        //printing new values:
        System.out.println("printing new values:");
        System.out.println(frenchBulldog.name);
        System.out.println(frenchBulldog.sex);
        System.out.println(frenchBulldog.age);
        System.out.println(frenchBulldog.isMale);
        System.out.println("Calling method");
        frenchBulldog.printData();

        frenchBulldog = null; // deleting the object
        System.out.println(Dog.isGoodDog);

        //printing new values:
        System.out.println("printing null values:");
        System.out.println(frenchBulldog.name);

        System.out.println(localVariable);

    }
}

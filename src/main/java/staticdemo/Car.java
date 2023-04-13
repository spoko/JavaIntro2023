package staticdemo;

public final class Car extends DriveCar{
    //only one value that belong to the class
    protected static int counter;
    protected int price;
    protected static final boolean FOUR_WHEEL_DRIVE;



    public Car(){
        System.out.println("Calling the constructor");
        counter++;
        //FOUR_WHEEL_DRIVE = true; //not possible
    }

    public int getCounter() {
        return counter;
    }

    //static initializers
    static {
        System.out.println("Calling static initializers");
        counter = 0;
        FOUR_WHEEL_DRIVE = true;
    }

    @Override
    public void moveForward(int distance) {
        System.out.println("Driving forward for " + distance);
    }

    @Override
    public void moveBackwards(int distance) {
        System.out.println("Driving backwards for " + distance);

    }

    //we cannot override a final method!!!
//    public void turn(String direction){
//        System.out.println("Driving sideways...");
//    }

    public static void fakeProductionOfACar(){
        counter++;
        //price = 2000; //we cannot access non-static variables inside a static method!!!
    }
}

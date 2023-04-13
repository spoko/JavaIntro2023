package staticdemo;

public abstract class DriveCar {
    public abstract void moveForward(int distance);
    public abstract void moveBackwards(int distance);

    //we can have non-abstract method in abstract class
    public final void turn(String direction){
        System.out.println("Turning " + direction);
    }
}

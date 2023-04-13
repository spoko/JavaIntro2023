package staticdemo;

public class Test {
    public static void main(String[] args) {
        Car.fakeProductionOfACar();
        System.out.println(Car.counter);

        Car car1 = new Car();
        //System.out.println(car1.getCounter());
        System.out.println(Car.counter);
        Car car3 = new Car();
        //System.out.println(car3.getCounter());
        System.out.println(Car.counter);
        Car.fakeProductionOfACar();
        System.out.println(Car.counter);//
        car1.fakeProductionOfACar();//this is wrong but possible :)
        System.out.println(car1.counter);//wrong but possible
        //DriveCar drivingCar = new DriveCar();//not possible to have object from an abstract class
    }
}

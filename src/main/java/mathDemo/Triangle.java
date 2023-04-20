package mathDemo;

public class Triangle {
    public static void main(String[] args) {

        try {
            System.out.println(3 / 0);
        }catch (ArithmeticException e){
            System.out.println("We cannot divide by 0 ;(");
        }

        System.out.println(calculateAreaOfTriangleByTwoSidesAndAngle(3,4,90));

    }

    private static int calculateAreaOfTriangleByTwoSidesAndAngle(int a, int b, double angle){
        return (int) (a * b * 0.5 * Math.sin(Math.toRadians(angle)));
    }
}

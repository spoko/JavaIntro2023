package mathDemo;

public class Triangle {
    public static void main(String[] args) {

        System.out.println(calculateAreaOfTriangleByTwoSidesAndAngle(3,4,90));

    }

    private static int calculateAreaOfTriangleByTwoSidesAndAngle(int a, int b, double angle){
        return (int) (a * b * 0.5 * Math.sin(Math.toRadians(angle)));
    }
}

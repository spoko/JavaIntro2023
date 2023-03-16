package operators;

public class Aritmetic {
    public static void main(String[] args) {
        int a, c, d;
        a = c = d = 5;
        int b = 7;
        int sum = a + b;
        double preciseSum = sum;
        byte newSum = (byte) preciseSum;
        System.out.println(7 % 2); //what will remain after whole number division
        System.out.println(a);//will print 5
        System.out.println(a++);//will print 5
        System.out.println(a);//will print 6
        System.out.println(++b);//will print 8

        System.out.println(a == b); //false
        System.out.println(a != b); //true

        System.out.println(sum);//12
        sum += a;//12 (sum) + 5 (a) sum += a; => sum = sum + a;
        System.out.println(sum);//17
    }
}

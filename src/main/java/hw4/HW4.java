package hw4;

public class HW4 {
    /*
        Напишете програма, която приема масив от числа и изчислява сумата на всички
        четни и нечетни числа от поредицата изписвайки подходящо съобщение с резултата.

     */
    public static void main(String[] args) {
        int n = 5;

        //solution 1:
        for (int i = 1; i <= n; i++) {
            System.out.printf("Current number is: %d\n", i);
        }

        System.out.println("----------------");

        printNumbers(7);
    }

    public static void printNumbers(int n){
        for (int i = 1; i <= n; i++) {
            System.out.printf("Current number is: %d\n", i);
        }
    }
}

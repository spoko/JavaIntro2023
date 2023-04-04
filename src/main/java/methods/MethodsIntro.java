package methods;

import java.util.Scanner;

public class MethodsIntro {
    public static String staticName = "special static name";

    public static void main(String[] args) {
        printNumbersToN(5);

        String result = returnTheWord();
        System.out.println(result);
        //better way of doing this:
        System.out.println(returnTheWord());

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a:");
        int firstEnteredNumber = sc.nextInt();
        System.out.println("Please enter b:");
        int secondEnteredNumber = sc.nextInt();

        System.out.printf("The sum of %d and %d is: %d\n", firstEnteredNumber, secondEnteredNumber,
                sum(sum(firstEnteredNumber, secondEnteredNumber), sum(secondEnteredNumber, secondEnteredNumber)));

        System.out.println(sum(4,6));
        System.out.println(sum(56,66));
        System.out.println(sum(3,5,6));
        //calling a method:
        sum(5,10);
    }

    //method which will not return anything
    public static void printNumbersToN(int n){

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    //method that will return a string
    public static String returnTheWord(){
        String theWord = "secret";
        return theWord;
    }

    public static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }

    //method overload
    public static int sum(int a, int b, int c){
        int sum = a + b + c;
        return sum;
    }

}

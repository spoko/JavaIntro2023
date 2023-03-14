package qa.intro;

import java.util.Scanner;

public class MyFirstClass {

    public static void main(String[] args) {
        int five = 7;

        System.out.println("Hello World");

        System.out.println(five);

        //Reading input from the console
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");

        String userName = scanner.nextLine();

        System.out.println("Nice to meet you, " + userName + "!");

        System.out.println("Please enter your age:");

        int userAge = scanner.nextInt();

        if (userAge < 0) {
            System.out.println("Invalid data!");
            return;
        }

        if (userAge < 18) {
            System.out.println(userName + " is not allowed to drink!");
        } else {
            System.out.println("Cheers, " + userName);
        }
        StringAttaching someString = new StringAttaching();
    }

}

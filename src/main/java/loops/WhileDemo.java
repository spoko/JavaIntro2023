package loops;

public class WhileDemo {

    public static void main(String[] args) {
        printFactorial(0.0);
        printFactorial(0);


    }

    public static void printFactorial(double number){
        double result = 1;
        double inputValue = number;

        while (inputValue > 0){
            result *= inputValue; // factorial = factorial * inputNumber;
            inputValue--;
            System.out.println("Calculating with While");
        }

        System.out.printf("You have entered: %f. Factorial is: %f\n", number, result);
    }

    public static void printFactorial(int number){
        int result = 1;
        int inputValue = number;

        do{
            result *= inputValue; // factorial = factorial * inputNumber;
            inputValue--;
            System.out.println("Calculating with Do While");
        }while (inputValue > 0);

        System.out.printf("You have entered: %d. Factorial is: %d\n", number, result);
    }

}

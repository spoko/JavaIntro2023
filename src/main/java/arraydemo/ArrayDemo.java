package arraydemo;

import java.util.LinkedList;

public class ArrayDemo {
    String [] words = null;

    public static void main(String[] args) {
        String text = "Some random text blah blah blah";
        int [] numbers = {5, 12, 3, 6, 56, 654};
        String [] cities = {"Sofia", "Plovdiv", "Burgas", "Varna", "Vratsa"};
        String [] words = text.split(" ");
        char[] mustHavePasswordSymbols = {'#', '%', '*'};


        int [][] matrix = {
                {3, 5, 8},
                {5, 78, 90, 99, 10},
                {78, 2},
                {0, 18, 33}
        };

        int [] defaultValues = new int[10];

        //change one exact value on first position
        defaultValues[0] = 5;

        //printing one exact value at first position
        System.out.println(defaultValues);

        //printing all array values for defaultValues:
        for (int i = 0; i < defaultValues.length; i++) {
            System.out.printf("Value of the element on position %d is: %d\n", i, defaultValues[i]);
        }

        System.out.println("---------------------");

        for (int i = 0; i < cities.length; i++){
            System.out.printf("Value of the element on position %d is %s\n", i, cities[i]);
        }

        //printing words
        for (int i = 0; i < words.length; i++) {
            System.out.printf("Word on position %d is: %s\n", i, words[i]);
        }

        //printing with for each - cities:
        System.out.println("---------------------");
        for (String city : cities ){
            System.out.printf("Current city is: %s\n", city);
        }

        System.out.println("---------------------");
        for (int number : numbers){
            System.out.printf("Current value is: %d\n", number);
        }

        System.out.println(words);

        System.out.println("---------------------");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("Element on row %d and column %d is: %d\n", i, j, matrix[i][j]);
            }
        }
    }
}

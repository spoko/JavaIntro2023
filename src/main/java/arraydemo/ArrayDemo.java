package arraydemo;

public class ArrayDemo {

    public static void main(String[] args) {
        String text = "Some random text blah blah blah";
        int [] numbers = {5, 12, 3, 6};
        String [] cities = {"Sofia", "Plovdiv", "Burgas", "Varna", "Vratsa"};
        String [] words = text.split(" ");
        char[] mustHavePasswordSymbols = {'#', '%', '*'};

        int [] defaultValues = new int[10];

        //change one exact value on first position
        defaultValues[0] = 5;

        //printing one exact value at first position
        System.out.println(defaultValues[0]);

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

    }
}

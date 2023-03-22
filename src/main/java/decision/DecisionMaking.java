package decision;

public class DecisionMaking {

    public static void main(String[] args) {
        //calling the method from the class using different parameters
        printUserDetails(-20);
        printUserDetails(0);
        printUserDetails(12);
        printUserDetails(13);
        printUserDetails(35);
        //missing some tests
        printUserDetails(131);

        printMonthOfTheYear(2);

    }

    public static void printUserDetails(int age){
        //kid: 0-12
        //teenager: 13 - 19
        //adult: 20 - 65
        //retired: 66 - 130
        if (age < 0){
            System.out.println("Invalid entry");
            return;
        }
        if (age >= 0 && age <= 12){
            System.out.printf("The user is a kid with the age of %d\n", age);
        }else if (age >=13 && age <=19){
            System.out.printf("The user is a teenager with the age of %d\n", age);
        }else if (age >=20 && age <=65){
            System.out.printf("The user is an adult with the age of %d\n", age);
        }else if (age >=66 && age <=130){
            System.out.printf("The user is a retired with the age of %d\n", age);
        }else {
            System.out.println("Vampire!!!");
        }
    }

    public static void printMonthOfTheYear(int month){
        switch (month){
            case 1:
                System.out.printf("The selected month is: January\n");
                break;
            case 2:
                System.out.printf("The selected month is: February\n");
                break;
            default:
                System.out.printf("Incorrect value!\n");
        }
    }
}

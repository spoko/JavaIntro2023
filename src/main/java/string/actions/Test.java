package string.actions;

public class Test {

    public static void main(String[] args) {
        String testString = " some random string ";
        byte dogAge = 2;
        String userName = "Random User";
        double bankBallance = 2342.34532;

        System.out.println(testString.charAt(5)); //indexes start from 0!!!!
        System.out.println(testString.length());
        System.out.println(testString.charAt(testString.length() - 1)); //return the last character

        String[] splitted = testString.split(" ");
        System.out.println(splitted.length);

        String[] splittedTrimmed = testString.trim().split(" ");
        System.out.println(splittedTrimmed.length);

        System.out.printf("The dog age is: \"%d\"\n", dogAge);
        System.out.printf("Nice to meet you '%s'\n", userName);
        System.out.printf("User \\balance is: %.2f\n", bankBallance);

    }
}

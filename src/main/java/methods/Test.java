package methods;

import enumDemo.WeekDays;

public class Test {
    public static void main(String[] args) {
        System.out.println(MethodsIntro.sum(5,5));
        MethodsIntro.printNumbersToN(5);

        System.out.println(MethodsIntro.staticName);

        printIfTrue(true);
        printWeekDay(WeekDays.FRIDAY);
        printWeekDay(WeekDays.MONDAY);
    }

    public static void printIfTrue(boolean print){
        if (print){
            System.out.println("True and print");
            return;
        }

        System.out.println("False and don`t print");
    }

    public static void printWeekDay(WeekDays day){
        switch (day){
            case FRIDAY -> System.out.println("Selected day is 5ak!!!");
            case MONDAY -> System.out.println("Selected day is ;(");
        }
    }
}

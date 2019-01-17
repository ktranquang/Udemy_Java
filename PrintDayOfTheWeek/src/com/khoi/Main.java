package com.khoi;

/**
 * Created by khoi on Jan, 2019
 */
public class Main {
    public static void main(String[] args) {
        printDayOfTheWeek(-1);
        printDayOfTheWeek(1);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);
        DayOfTheWeekChallenge.printDayOfTheWeek(-1);

    }

    public static void printDayOfTheWeek(int day) {
        switch(day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid day");
                break;
        }
    }
}

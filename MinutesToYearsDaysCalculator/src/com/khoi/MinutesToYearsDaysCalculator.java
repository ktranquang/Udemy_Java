package com.khoi;

/**
 * Created by khoi on Jan, 2019
 */
public class MinutesToYearsDaysCalculator {
    // write your code here
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }
        else {
            System.out.println(minutes + " min = " + minutes/(60*24*365)  + " y and " + (minutes%525600)/60/24 + " d");
        }
    }
}
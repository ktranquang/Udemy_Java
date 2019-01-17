package com.khoi;

/**
 * Created by khoi on Jan, 2019
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
        System.out.println(getDaysInMonth(1, -2018));
    }
    public static boolean isLeapYear(int year) {
        if ((year < 1) || (year > 9999)) {
            return false;
        } else {
            if ((((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400) == 0)) {
                return true;
            }
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if(month < 1 || month > 12) {
            return -1;
        }
        if(year <1 || year > 9999) {
            return -1;
        }
        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)) {
            return 31;
        }
        else if (isLeapYear(year) && month == 2) {
            return 29;
        } else if (!isLeapYear(year) && month == 2) {
            return 28;
        } else if (month == 2 || month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return -1;
        }
    }
}

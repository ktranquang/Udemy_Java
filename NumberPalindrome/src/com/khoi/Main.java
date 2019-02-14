package com.khoi;

/**
 * Created by khoi on Feb, 2019
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221)); // True
        System.out.println(isPalindrome(707)); // True
        System.out.println(isPalindrome(11212)); // False

    }
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverse = 0;
        int lastDigit = 0;

        while(number != 0) {
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }
        if(originalNumber == reverse) {
            return true;
        } else {
            return false;
        }
    }

}


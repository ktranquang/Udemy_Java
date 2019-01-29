package com.khoi;

/**
 * Created by khoi on Jan, 2019
 */
public class SumOddRange {

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        } else if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if(start > 0 && end > 0 && end >= start) {
            for(int i = start; i <= end; i++) {
                if(isOdd(i)) {
                    sum += i;
                }
            }
        } else {
            return -1;
        }
        return sum;
    }
}
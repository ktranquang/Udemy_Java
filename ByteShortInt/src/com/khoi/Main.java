package com.khoi;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
        int myMinValue= -2147483648; // 2^31
	    int myMaxValue= 2147483647; // 2^31 - 1
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

	    // byte has a width of 8
	    byte myByteValue = -128; // 127 max
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myNewByteTotal = " + myNewByteValue);

        // short has a width of 16
        short myShortValue = -32768; // 32767 max
        short myNewShortValue = (short) (myShortValue/2);

        // long has a width of 64
        long myLongValue =100L; // 100l min is 2^63 and max 2^63-1

        // 1. Create a byte variable and set it to any valid byte number.
        // 2. Create a short variable and set it to any valid short number.
        // 3. Create a int variable and set it to any valid int number.
        // 4. Create a variable of type long, and make it equal to
        //    5000 + 10 times the sum of the byte, plus the short plus the int

        byte byteValue = 120;
        short shortValue = 32700;
        int intValue = 69;

        long longTotal = (5000L + 10L * (byteValue + shortValue + intValue));
        short shortTotal = (short) (5000L + 10L * (byteValue + shortValue + intValue));
        System.out.println("longTotal = " + longTotal);
        System.out.println("shortTotal = " + shortTotal);
        // long accepts int, no casting required
    }
}

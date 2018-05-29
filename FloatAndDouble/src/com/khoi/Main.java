package com.khoi;

public class Main {

    public static void main(String[] args) {
	    // width of int = 32 (4 bytes)
        int myIntValue = 5 / 3;
	    // width of float = 32 (4 bytes)
        float myFloatValue = 5f / 3f; // 7 decimal
    	// width of double = 64 (8 bytes)
        double myDoubleValue = 5d / 3d; // 16 decimal --- writing .2 java assumes it's a double

        // double is faster on modern computers
        // built in functions in Java uses double
        // double is also more precise
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleVlaue = " + myDoubleValue);

        // Convert a given number of points to kilograms
        // 1. Create a variable to store the number of pounds
        // 2. Calculate the number of Kilograms for the number above and store in a variable.
        // 3. Print out the result.
        //
        // Notes: 1 pound is equal to 0.45359237 kilograms.

        double numPounds = 200d;
        double convertedKilograms = numPounds * 0.45359237d;
        System.out.println(convertedKilograms);
        // 90.7185
        double pi = 3.141_5927d;
        // Can use underscores to make your values cleaner when setting it as a literal
    }
}

package com.khoi;

/**
 * Created by khoi on Jan, 2019
 */
public class Main {
    public static void main(String[] args) {
        int count = 1;
        while(count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;

        while(true) {
            if(count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
        do {
            System.out.println("Count value is " + count);
            count++;
        } while(count !=6);

//        for(int i=1; i<7; i++) {
//            System.out.println("Count value is " + count);
//        }
//        for(count = 1; count != 6; count++) {
//            System.out.println("Count value is " + count);
//        }
        // Create a method called isEvenNumber that takes a parameter of type int
        // Its purpose is to determine if the argument passed to the method is
        // an even number or not
        // return true if an even number, otherwise return false;
    }
}

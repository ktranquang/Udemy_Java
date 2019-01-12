package com.khoi;

/**
 * Created by khoi on Jan, 2019
 */
public class PlayingCat {
    // write your code here
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if((summer == true) && (temperature >= 25 && temperature <= 45)){
            return true;
        }
        else if((summer == false) && (temperature >= 25 && temperature <= 35)) {
            return true;
        }
        else {
            return false;
        }
    }
}
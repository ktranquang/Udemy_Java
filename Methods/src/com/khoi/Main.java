package com.khoi;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(true, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(true, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        // Create a method called displayHighScorePosition
        // it should use a player's name as a parameter, and a 2nd parameter as a highScorePosition in the high score table
        // You should display the players name along with a message like " managed to get into highScorePosition " and the
        // highScorePosition they got and a further message " on the high score table".
        //
        // Create a 2nd method called calculateHighScorePosition
        // it should be sent one argument only, the player score
        // it should return an int
        // the return data should be
        // 1 if the score is >=1000
        // 2 if the score is >=500 and < 1000
        // 3 if the score is >=100 and < 500
        // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400, and 50
        //

        displayHighScorePosition("Tim", calculateHighScorePosition(1500));
        displayHighScorePosition("Bob", calculateHighScorePosition(900));
        displayHighScorePosition("Percy", calculateHighScorePosition(400));
        displayHighScorePosition("Gilbert", calculateHighScorePosition(50));

        displayHighScorePosition("Louise", calculateHighScorePosition(1000));
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) { // void - procedure
        System.out.println(playerName + " managed to get into highScorePosition "
                + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) { // method AKA function
//
//        if (playerScore >= 1000){
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//            return 4;
//
        int position = 4; // assuming position 4 will be returned

        if(playerScore >= 1000) {
            position = 1;
        } else if(playerScore >= 500) {
            position = 2;
        } else if(playerScore >= 100) {
            position = 3;
        }

        return position;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }
}

package com.diazbumma;

public class Main {

    public static void main(String[] args) {
        boolean isGameOver  = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int scoreOutput = calculateScore(isGameOver, score, levelCompleted, bonus);
        System.out.println("Your final score is " + scoreOutput);

        score = 10_000;
        levelCompleted = 8;
        bonus = 200;

        scoreOutput = calculateScore(isGameOver, score, levelCompleted, bonus);
        System.out.println("Your final score is " + scoreOutput);

        displayHighScorePosition("Diaz", calculateHighScorePosition(1500));
        displayHighScorePosition("Fadli", calculateHighScorePosition(900));
        displayHighScorePosition("Faldy", calculateHighScorePosition(400));
        displayHighScorePosition("Abdur", calculateHighScorePosition(50));
    }

    public static int calculateScore (boolean isGameOver, int score, int levelCompleted, int bonus) {
        if (isGameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " manage to get into postion " + position + " on the highscore table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }
}

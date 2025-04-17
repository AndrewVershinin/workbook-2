package com.pluralsight;

import java.util.Arrays;

public class TestStatisticsApp {
    public static void main(String[] args) {
        int[] testScores = {78, 99, 33, 39, 100, 84, 71, 60, 66, 70};

        Arrays.sort(testScores);

        int highScore = testScores[testScores.length - 1];
        int lowScore = testScores[0];

        int sum = 0;
        for (int i = 0; i < testScores.length; i++) {
            sum += testScores[i];
        }
        System.out.println("average: " + sum / 10);
        System.out.println("high score: " + highScore);
        System.out.println("low score: " + lowScore);

    }

}

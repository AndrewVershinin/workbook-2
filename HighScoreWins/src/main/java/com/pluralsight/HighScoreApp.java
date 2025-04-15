package com.pluralsight;
import java.util.Scanner;

public class HighScoreApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


// Home:Visitor|21:9
        System.out.print("Please enter a game score: ");
        String gameScore = input.nextLine().replace(" ", "").trim();

        String[] parts = gameScore.split("\\|");

        String[] teams = parts[0].split(":");
        String[] scores = parts[1].split(":");


        String homeTeam = teams[0];
        String visitorTeam = teams[1];

        String homeScore = scores[0];
        String visitorScore = scores[1];
        int homeScoreInt = Integer.parseInt(homeScore);
        int visitorScoreInt = Integer.parseInt(visitorScore);

        if (homeScoreInt > visitorScoreInt) {
            System.out.println("Winner: " + homeTeam);
        } else if (homeScoreInt < visitorScoreInt) {
            System.out.println("Winner: " + visitorTeam);
        } else {
            System.out.println("Draw");
        }

        input.close();
    }
}

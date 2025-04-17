package com.pluralsight;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        // Step 1: Prompt the user for input
        System.out.print("Please enter a game score: ");
        String input = scanner.nextLine();

        // Split the input into two parts: teams and scores
        String[] parts = input.split("\\|");
        String teamsPart = parts[0];
        String scoresPart = parts[1];

        // Further split the team and score parts
        String[] teams = teamsPart.split(":");
        String[] scores = scoresPart.split(":");

        String team1 = teams[0];
        String team2 = teams[1];

        int score1 = Integer.parseInt(scores[0]);
        int score2 = Integer.parseInt(scores[1]);

        // Determine and print the winner
        if (score1 > score2) {
            System.out.println("Winner: " + team1);
        } else if (score2 > score1) {
            System.out.println("Winner: " + team2);
        } else {
            System.out.println("It's a tie!");
            System.out.println("Lets flip a coin for the Winner The...");
            String winner = random.nextBoolean() ? team1 : team2;
            System.out.println("Congrats: " + winner + " You won the game of luck");
        }
    }
}
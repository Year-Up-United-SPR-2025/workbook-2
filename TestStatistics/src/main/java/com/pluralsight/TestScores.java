package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;

public class TestScores {
    public static void main(String[] args) {
        // ArrayList to hold Test Scores
        ArrayList<Integer> testScores = new ArrayList<Integer>();

        // Add 10 Test Scores
        testScores.add(88);
        testScores.add(92);
        testScores.add(76);
        testScores.add(81);
        testScores.add(95);
        testScores.add(68);
        testScores.add(73);
        testScores.add(90);
        testScores.add(84);
        testScores.add(77);
        testScores.add(100);

        System.out.println("Test Scores: " + testScores);

        // Calculate Average
        int sum = 0;
        for (int score : testScores) {
            sum += score;
        }
        double average = (double) sum / testScores.size();
        System.out.println("Average Score: " + average);

        // Find high score
        int high = Collections.max(testScores);
        System.out.println("Highest Score: " + high);

        // Find Low Score
        int low = Collections.min(testScores);
        System.out.println("Lowest Score: " + low);

        // BONUS: Calculate Median
        Collections.sort(testScores);
        double median;
        int size = testScores.size();
        if (size % 2 == 0) {
            // average of middle two numbers
            median = (testScores.get(size / 2 - 1) + testScores.get(size / 2)) / 2.0;
        } else {
            median = testScores.get(size / 2);
        }
        System.out.println("Median Score: " + median);

        // Difference between Average and Median
        System.out.println("Difference between Average and Median: " + Math.abs(average - median));
    }
}
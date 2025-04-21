package com.pluralsight;


public class Main {
    public static void main(String[] args) {

        Dice dice = new Dice();

        int roll1;
        int roll2;
        int NumOf2 = 0;
        int NumOf4 = 0;
        int NumOf6 = 0;
        int NumOf7 = 0;

        for (int rollNumber = 1; rollNumber <= 10000; rollNumber++){
            roll1 = dice.roll();
            roll2 = dice.roll();
            int rollTotal = roll1 + roll2;
            System.out.printf("Roll #%d: %d - %d Sum: %d\n", rollNumber, roll1, roll2, rollTotal);
            if(rollTotal ==2) {NumOf2++;}
            if(rollTotal ==4) {NumOf4++;}
            if(rollTotal ==6) {NumOf6++;}
            if(rollTotal ==7) {NumOf7++;}
        }

        System.out.println("Total number of 2s:" + NumOf2);
        System.out.println("Total number of 4s:" + NumOf4);
        System.out.println("Total number of 6s:" + NumOf6);
        System.out.println("Total number of 7s:" + NumOf7);
    }
}
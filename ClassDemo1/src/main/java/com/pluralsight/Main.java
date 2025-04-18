package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the persons name: ");
        String fullName = scanner.nextLine();

        System.out.println("What is the age Name: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is the persons Profession: ");
        String profession = scanner.nextLine();

        System.out.printf("Person %s is a %s and is %d years old.", fullName, profession, age);

    }
}
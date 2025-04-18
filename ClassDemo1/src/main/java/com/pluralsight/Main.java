package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the persons name: ");
        String fullName = scanner.nextLine();

        System.out.print("What is the age Name: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // clears CRLF

        System.out.print("What is the persons Profession: ");
        String profession = scanner.nextLine();

        displayPerson(fullName, age, profession);
        savePerson(fullName, age, profession);

    }

    public static void displayPerson(String fullName, int age, String profession){
        System.out.printf("Person %s is a %s and is %d years old.", fullName, profession, age); //%s pace holder for a string //%d placeholder for int
    }

    public static void savePerson(String fullName, int age, String profession){
        //do the work of saving a person in a database
    }
}
package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //establish known values
        System.out.println("What is your full name?: ");
        String name = scanner.nextLine();

        //calculate the unknown
        String firstName = "";
        String middleName = "";
        String lastName = "";

        //display the results
        System.out.println();
        System.out.println("First Name" + firstName);
        System.out.println("Middle Name" + middleName);
        System.out.println("Last Name" + lastName);


    }
}
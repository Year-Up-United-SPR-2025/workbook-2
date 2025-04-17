package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //get known values
        System.out.println("Please enter your name");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Middle Name: ");
        String middleName = scanner.nextLine();

        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Suffix: ");
        String suffix = scanner.nextLine();

        //compute the unknown
        String fullName = firstName;
        if(middleName.isEmpty()){
            fullName += " " + middleName;
        }
        fullName += " " + lastName;

        if(suffix.isEmpty()){
            fullName += ", " + suffix;
        }

        System.out.println("Full Name: " + fullName);


    }
}

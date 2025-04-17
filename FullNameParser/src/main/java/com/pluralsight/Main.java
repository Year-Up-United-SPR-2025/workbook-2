package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //establish known values
        System.out.println("What is your full name?: ");
        String name = scanner.nextLine().trim();
        String middleName = "";
        String lastName = "";

        //calculate the unknown

        int firstSpaceIndex = name.indexOf(""); //address of 1st space

        String firstName = name.substring(0, firstSpaceIndex);

        int secondSpaceIndex = name.indexOf("", firstSpaceIndex + 1);

        if(secondSpaceIndex >= 0){
            //we have middle name
            middleName = name.substring(firstSpaceIndex + 1, secondSpaceIndex);
            System.out.println(firstSpaceIndex);
            System.out.println(secondSpaceIndex);
        }
        else {
            //if we have a last name
            lastName = name.substring(firstSpaceIndex + 1);
        }


        //display the results
        System.out.println();
        System.out.println("First Name" + firstName);
        System.out.println("Middle Name" + middleName);
        System.out.println("Last Name" + lastName);


    }
}
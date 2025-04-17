package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //establish known values
        System.out.println("What is your full name?: ");
        String name = scanner.nextLine().trim();
       String middleName = "";
        String lastName = "";

        //calculate the unknown

        int firstSpaceIndex = name.indexOf(""); //addresses of 1st space

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

//        String[] names = name.split(Pattern.quote(" "));
//
//        String firstName = names[0];
//        String middleName;
//        String lastName;
//
//        if(names.length == 2){
//            middleName = "(none)";
//            // lastName = names[1];
//        }
//        else{
//            middleName = names[1];
//            //lastName = names[2];
//        }
//
//        lastName = names[names.length -1 ];


        //display the results
        System.out.println();
        System.out.println("First Name" + firstName);
        System.out.println("Middle Name" + middleName);
        System.out.println("Last Name" + lastName);


    }
}
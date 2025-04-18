package com.pluralsight;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        // Prompt user for their full name
        System.out.print("Please enter your name: ");
        String fullName = scanner.nextLine();

        // Split full name into first and last name
        String[] nameParts = fullName.split(" ", 2);
        String firstName = nameParts.length > 1 ? nameParts[0] : fullName;
        String lastName = nameParts.length > 1 ? nameParts[1] : "";

        // Prompt for the date of the show
        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String dateInput = scanner.nextLine();
        LocalDate showDate = LocalDate.parse(dateInput, formatter);

        // Prompt for the number of tickets
        System.out.print("How many tickets would you like? ");
        int ticketCount = scanner.nextInt();

        // Generate reservation message
        String ticketWord = (ticketCount == 1) ? "ticket" : "tickets";
        System.out.println(ticketCount + " " + ticketWord + " reserved for " + showDate + " under " + lastName + ", " + firstName);

        scanner.close();
    }
}
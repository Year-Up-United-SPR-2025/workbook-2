package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create StringBuilders for the output
        StringBuilder fullAddress = new StringBuilder();
        StringBuilder billingAddress = new StringBuilder();
        StringBuilder shippingAddress = new StringBuilder();

        // Prompt to collect input
        System.out.println("Please Provide the Following Information \n");
        System.out.println("/////////////////////////////////////");
        System.out.print("Please Enter Your Full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Please Enter Your Billing Street: ");
        String billingStreet = scanner.nextLine();

        System.out.print("Please Enter Your Billing City: ");
        String billingCity = scanner.nextLine();

        System.out.print("Please Enter Your Billing State: ");
        String billingState = scanner.nextLine();

        System.out.print("Please Enter Your Billing Zip: ");
        String billingZip = scanner.nextLine();

        System.out.print("Please Enter Your Shipping Street: ");
        String shippingStreet = scanner.nextLine();

        System.out.print("Please Enter Your Shipping City: ");
        String shippingCity = scanner.nextLine();

        System.out.print("Please Enter Your Shipping State: ");
        String shippingState = scanner.nextLine();

        System.out.print("Please Enter Your Shipping Zip: ");
        String shippingZip = scanner.nextLine();

        // Build the address using StringBuilder
        fullAddress.append(fullName).append("\n");

        billingAddress.append("Billing Address:\n");
        billingAddress.append(billingStreet).append("\n");
        billingAddress.append(billingCity).append(", ");
        billingAddress.append(billingState).append(" ");
        billingAddress.append(billingZip).append("\n");

        shippingAddress.append("Shipping Address:\n");
        shippingAddress.append(shippingStreet).append("\n");
        shippingAddress.append(shippingCity).append(", ");
        shippingAddress.append(shippingState).append(" ");
        shippingAddress.append(shippingZip);

        // Display the full address information
        System.out.println("\nCustomer Information:");
        System.out.println(fullAddress.toString());
        System.out.println(billingAddress.toString());
        System.out.println(shippingAddress.toString());
        System.out.println("/////////////////////////////////////");
    }
}
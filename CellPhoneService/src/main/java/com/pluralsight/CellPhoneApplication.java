package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone phone = new CellPhone();

        int serialNumber;
        String model;
        String carrier;
        String phoneNumber;
        String owner;

        //User Prompts
        System.out.println("Enter Your Cell Phone Info?: ");

        System.out.println("What is the serial number?: ");
        serialNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is the model of the phone?: ");
        model = scanner.nextLine();

        System.out.println("Who is the carrier?: ");
        carrier = scanner.nextLine();

        System.out.println("What is the phone number?: ");
        phoneNumber = scanner.nextLine();

        System.out.println("Who is the Owner of the Phone?: ");
        owner = scanner.nextLine();

        phone.setSerialNumber(serialNumber);
        phone.setModel(model);
        phone.setCarrier(carrier);
        phone.setPhoneNumber(phoneNumber);
        phone.setOwner(owner);

        System.out.println("\n--- Cell Phone Information ---");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
    }
}
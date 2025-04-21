package com.pluralsight;
import java.util.Scanner;

public class VechicleInv {
     static Vehicle[] inventory = new Vehicle[20];
    static int count = 6;

    public static void main(String[] args) {
        preloadVehicles();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWhat do you want to do?");
            System.out.println(" 1 - List all vehicles");
            System.out.println(" 2 - Search by make/model");
            System.out.println(" 3 - Search by price range");
            System.out.println(" 4 - Search by color");
            System.out.println(" 5 - Add a vehicle");
            System.out.println(" 6 - Quit");
            System.out.print("Enter your command: ");

            int command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {
                case 1:
                    listAllVehicles();
                    break;
                case 2:
                    searchByMakeModel(scanner);
                    break;
                case 3:
                    searchByPrice(scanner);
                    break;
                case 4:
                    searchByColor(scanner);
                    break;
                case 5:
                    addAVehicle(scanner);
                    break;
                case 6:
                    System.out.println("Goodbye and good luck with your car!");
                    return;
                default:
                    System.out.println("Invalid command please try again.");
            }
        }
    }

    public static void preloadVehicles() {
        inventory[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        inventory[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        inventory[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        inventory[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        inventory[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        inventory[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);
    }

    public static void listAllVehicles() {
        System.out.println("\n--- Vehicle List ---");
        for (int i = 0; i < count; i++) {
            System.out.println(inventory[i]);
        }
    }

    public static void searchByMakeModel(Scanner scanner) {
        System.out.print("Enter make/model to search: ");
        String keyword = scanner.nextLine().toLowerCase();

        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (inventory[i].getMakeModel().toLowerCase().contains(keyword)) {
                System.out.println(inventory[i]);
                found = true;
            }
        }
        if (!found) System.out.println("No vehicles found matching: " + keyword);
    }

    public static void searchByPrice(Scanner scanner) {
        System.out.print("Enter minimum price: ");
        float min = scanner.nextFloat();
        System.out.print("Enter maximum price: ");
        float max = scanner.nextFloat();

        boolean found = false;
        for (int i = 0; i < count; i++) {
            float price = inventory[i].getPrice();
            if (price >= min && price <= max) {
                System.out.println(inventory[i]);
                found = true;
            }
        }
        if (!found) System.out.println("No vehicles found in that price range.");
    }

    public static void searchByColor(Scanner scanner) {
        System.out.print("Enter color to search: ");
        String color = scanner.nextLine().toLowerCase();

        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (inventory[i].getColor().toLowerCase().equals(color)) {
                System.out.println(inventory[i]);
                found = true;
            }
        }
        if (!found) System.out.println("No vehicles found with color: " + color);
    }

    public static void addAVehicle(Scanner scanner) {
        if (count >= inventory.length) {
            System.out.println("Inventory full. Cannot add more vehicles.");
            return;
        }

        System.out.print("Enter vehicle ID: ");
        long id = scanner.nextLong();
        scanner.nextLine();

        System.out.print("Enter make/model: ");
        String makeModel = scanner.nextLine();

        System.out.print("Enter color: ");
        String color = scanner.nextLine();

        System.out.print("Enter odometer reading: ");
        int odo = scanner.nextInt();

        System.out.print("Enter price: ");
        float price = scanner.nextFloat();

        inventory[count] = new Vehicle(id, makeModel, color, odo, price);
        count++;

        System.out.println("Vehicle has been successfully added.");
    }
}
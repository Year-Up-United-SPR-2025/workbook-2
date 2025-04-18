package com.pluralsight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fullName;
        int age;
        String profession;

        //1st person
        System.out.print("What is the person's name: ");
        fullName = scanner.nextLine();

        System.out.print("What is the age: ");
        age = scanner.nextInt();
        scanner.nextLine(); // clears CRLF

        System.out.print("What is the persons Profession: ");
        profession = scanner.nextLine();

        Person thePerson = new Person(fullName, age, profession);

        //Other Person
        System.out.print("What is the other person's name: ");
        fullName = scanner.nextLine();

        System.out.print("What is the other person's age: ");
        age = scanner.nextInt();
        scanner.nextLine(); // clears CRLF

        System.out.print("What is the other persons Profession: ");
        profession = scanner.nextLine();

        Person theOtherPerson = new Person(fullName, age, profession);

        System.out.println(thePerson.getFullName());
        System.out.println(theOtherPerson.getFullName());

       displayPerson(thePerson);
       displayPerson(theOtherPerson);
//       savePerson(theOtherPerson);

    }

    public static void displayPerson(Person person){
        System.out.printf("Person %s is a %s and is %d years old.\n",
                person.getFullName(),
                person.getProfession(),
                person.getAge()); //%s pace holder for a string //%d placeholder for int
    }

    public static void savePerson(String fullName, int age, String profession){
        //do the work of saving a person in a database
    }
}
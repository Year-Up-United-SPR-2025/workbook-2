package com.pluralsight;

public class Counting {

    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 10) {
            sum += i;

            System.out.println("i = " + i); // lets you see the value and what is happening also a debugging technique
            System.out.println("sum =" + sum);// lets you see the value and what is happening  also a debugging technique
            System.out.println();// lets you see the value and what is happening  also a debugging technique
            i++;
        }
        System.out.println("----------------------------");
        System.out.println("Sum = " + sum);
    }
}

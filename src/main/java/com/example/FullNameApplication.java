package com.example;
import java.util.Scanner;

public class FullNameApplication {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String firstName;
        String middleName;
        String lastName;
        String suffix;

        System.out.println("Welcome to the Application software!");

        //Get names
        System.out.print("Please enter your first name: ");
        firstName = input.nextLine();

        System.out.println("Please enter your middle name: (leave empty if N/A) ");
        middleName = input.nextLine();


        System.out.print("Please enter your last name: ");
        lastName = input.nextLine();

        System.out.print("Please enter your Suffix if any!: ");
        suffix = input.nextLine();

        firstName = firstName.trim();
        middleName = middleName.trim();
        lastName = lastName.trim();
        suffix = suffix.trim();

        String finalName = firstName + middleName + lastName + suffix;

        System.out.println("Your name is " + finalName);

        //omit any spaces they  entered
        //return full name with comma before suffix

    }
}

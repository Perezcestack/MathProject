package com.example;
import java.util.Scanner;

public class FullNameParsec {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String firstName;
        String lastName;

        System.out.print("Hello please enter your first name: ");
        firstName = input.nextLine().trim();

        System.out.print("Please enter your last name: ");
        lastName = input.nextLine().trim();

        System.out.println("Hello " + firstName + " " + lastName);

        System.out.println("First Name:" + firstName);
        System.out.println("Last Name:" + lastName);


    }
}

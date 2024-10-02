package com.example;
import java.util.Arrays;
import java.util.Scanner;

public class FullNameParsec {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String wholeName;

        System.out.print("Hello please enter your Whole name: ");
        wholeName = input.nextLine();
        input.close();

        String[] names = wholeName.split("\\s+");

        String firstName = "";
        String middleName = "(none)";
        String lastName = "";

        if (names.length == 2) {
           firstName = names[0];
           lastName = names[1];
        } else if (names.length == 3){
           firstName = names[0];
            middleName = names[1];
            lastName = names[2];
        } else {
            System.out.println("ISSUE");
        }

        System.out.println("Your name is " + firstName + " " + middleName +" " + lastName);
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);

    }
}

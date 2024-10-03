package com.example;
import java.util.Scanner;

public class AddressBuilder {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // build stringbuilder to add to inputs
        StringBuilder address = new StringBuilder();

        // add inputs from user
        System.out.print("Hello, Please enter your Full Name: ");
        address.append(input.nextLine()).append(", ");

        System.out.print("Please enter your billing Street: ");
        address.append(input.nextLine()).append(", ");

        System.out.print("Please enter your billing City: ");
        address.append(input.nextLine()).append(", ");

        System.out.print("Please enter your billing State: ");
        address.append(input.nextLine()).append(", ");

        System.out.print("Please enter your billing Zip: ");
        address.append(input.nextLine()).append(", ");

        System.out.print("Please enter your Shipping Street: ");
        address.append(input.nextLine()).append(", ");

        System.out.print("Please enter your Shipping City: ");
        address.append(input.nextLine()).append(", ");

        System.out.print("Please enter your Shipping State: ");
        address.append(input.nextLine()).append(", ");

        System.out.print("Please enter your Shipping Zip: ");
        address.append(input.nextLine()).append(", ");

        // display input info
        String addressComplete = address.toString();
        System.out.println("Here is your information, Please make sure it is right! " );
        System.out.println(addressComplete);

    }
}

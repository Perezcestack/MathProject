package com.example;

import java.util.Objects;
import java.util.Scanner;

public class RentalCarCalculator {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("The rental car price is 29.99 with 30% surcharge for drivers under 25");
        System.out.print("Hello, How old are you?: ");

        int age = input.nextInt();
        input.nextLine();

        System.out.print("Hello, thanks for renting a car. What day is your pickup?: (write in DD/MM/YYYY format) ");
        String pickup = input.nextLine();

        System.out.print("How many days are you renting?: ");
        int days = input.nextInt();
        input.nextLine();

        System.out.print("Do you want an electronic toll tag for $3.95 a day? (yes or no) ");
        String toll = input.nextLine();

        System.out.print("Do you want a GPS for $2.95 a day?: (yes or no) ");
        String gps = input.nextLine();

        System.out.print("Do you want roadside assistance for $3.95 a day?: (yes or no) ");
        String roadSide = input.nextLine();

        double rental = 29.99;
        double totalCost;

        if (Objects.equals(toll, "yes")) {
            rental += 3.95;
        }
        if (Objects.equals(gps, "yes")) {
            rental += 2.95;
        }
        if (Objects.equals(roadSide, "yes")) {
            rental += 3.95;
        }
        if (age < 25) {
            rental = rental * 1.3;
        }
        totalCost = rental * days;

        System.out.println("The price for this trip is " + totalCost);
    }
}

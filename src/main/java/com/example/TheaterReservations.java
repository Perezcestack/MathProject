package com.example;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int tickets;
        String date;

        System.out.print("Please enter your first and last name: ");
        String [] name = input.nextLine().split(" ");

        String firstName = name[0];
        String lastName = name[1];

        System.out.println("What date will you be coming: (MM/dd/yyyy)");
        date = input.nextLine();

        System.out.print("Please enter the amount of tickets bought: ");
        tickets = input.nextInt();

        DateTimeFormatter formatter;

        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        if (tickets > 1) {
            System.out.println(tickets + " tickets reserved for " + date + " " + "under " + lastName + ", " + firstName);
        } else {
            System.out.println(tickets + " ticket reserved for " + date + " " + "under " + lastName + ", " + firstName);
        }
    }
}

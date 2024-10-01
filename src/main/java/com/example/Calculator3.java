package com.example;
import java.util.Scanner;

public class Calculator3 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        double monthlyPay;
        double expectedInt;
        int years;

            // Asking user for inputs
        System.out.print("Hello Please enter your monthly payout: ");
        monthlyPay = input.nextDouble();

        System.out.print("Now enter your expected interest: ");
        expectedInt = input.nextDouble();

        System.out.print("Enter your years to pay: ");
        years = input.nextInt();



    }
}

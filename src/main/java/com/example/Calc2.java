package com.example;
import java.util.Scanner;

public class Calc2 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        double deposit;
        double interestRate;
        int years;

        //Scanning all inputs from user
        System.out.print("Hi please enter your deposit amount: ");
        deposit = input.nextDouble();

        System.out.print("Now enter your interest rate: ");
        interestRate = input.nextDouble() / 100;

        System.out.print("Now enter your loan length in years: ");
        years = input.nextInt();

        //Calculations
        double finalValue = deposit * Math.pow(1 + interestRate / 12,12 * years);
        //double monthlyPayments = deposit * Math.pow(1 + interestRate / 12, years);

        System.out.println("Your estimated worth would be " + finalValue + " and accrued interest is " + (finalValue - deposit));



    }
}

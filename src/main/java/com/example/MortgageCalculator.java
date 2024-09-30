package com.example;

import java.util.Scanner;

public class MortgageCalculator {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        double interestRate;
        int loanLength;
        double loan;
        double monthlyPayment;


        System.out.print("Hi, Please enter your Interest rate: ");
        interestRate = input.nextDouble();
        double monthlyInterestRate = interestRate / 100 / 12;

        System.out.print("Please enter your loan length: ");
        loanLength = input.nextInt();
        int totalPayments = loanLength * 12;

        System.out.print("Now please enter your loan amount: ");
        loan = input.nextDouble();

        // calculate loan
        monthlyPayment = loan * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalPayments)) /
                (Math.pow(1 + monthlyInterestRate, totalPayments) - 1);

        System.out.println(monthlyPayment);
    }
}

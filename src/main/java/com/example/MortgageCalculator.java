package com.example;
import java.util.Scanner;

public class MortgageCalculator {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

    double interestRate;
    int loanLength;
    double loan;

        System.out.print("Hi, Please enter your Interest rate: ");
         interestRate = input.nextDouble();

        System.out.print("Please enter your loan length: ");
        loanLength = input.nextInt();

        System.out.print("Now please enter your loan amount: ");
        loan = input.nextDouble();

    }
}

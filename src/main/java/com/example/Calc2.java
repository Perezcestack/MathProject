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
        interestRate = input.nextDouble();

        System.out.print("Now enter your loan length in years: ");
        years = input.nextInt();



    }
}

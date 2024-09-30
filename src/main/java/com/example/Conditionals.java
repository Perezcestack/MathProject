package com.example;
import java.util.Scanner;

public class Conditionals {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("What size is your sandwich 1 or 2: ");
        System.out.println("1: 5.45$ or 2: 8.95");

        int size = input.nextInt();

        System.out.print("What is your age: ");
        int age = input.nextInt();


        input.close();

        double s1;
        if(size == 1) {
            s1 = 5.45;
        } else {
            s1 = 8.95;
        }

        if(age < 18) {
            s1 = s1 * 0.9;
        }else if (age >80) {
            s1 = s1 * 0.8;
        }
        System.out.println("The price for the sandwich is " + s1);




}}

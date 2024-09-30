package com.example;
import java.util.Scanner;

public class MathCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First enter a value: ");
        int x = input.nextInt();
        System.out.print("Second enter a value: ");
        int y = input.nextInt();
        input.nextLine();



        System.out.println("Possible Calculations: ");
        System.out.println("    (A)dd");
        System.out.println("    (S)ubtract");
        System.out.println("    (M)ultiply");
        System.out.println("    (D)ivide");
        System.out.print("Please select an option: ");

        String selected = input.nextLine();

        while (!selected.equals("A") && !selected.equals("S") && !selected.equals("M") && !selected.equals("D")) {
            System.out.print("ASMD have not been selected please try again: ");
            selected = input.nextLine();
        }
        float output;
        if (selected.equals("A")) {
            output = x + y;
            System.out.println(x + " + " + y + " = " + output);
        } else if (selected.equals("S")) {
            output = x - y;
            System.out.println(x + " - " + y + " = " + output);
        } else if (selected.equals("M")) {
            output = x * y;
            System.out.println(x + " * " + y + " = " + output);
        } else if (selected.equals("D")) {
            output = (float) x / y;
            System.out.println(x + " / " + y + " = " + output);
        }
    }
}

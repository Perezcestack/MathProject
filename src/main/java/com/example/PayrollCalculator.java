package com.example;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter your name: ");
    String name = input.nextLine(); // Declaring name = whatever they put^
    System.out.print("Please enter hours worked: ");
    float hours = input.nextFloat();
    System.out.print("What is your current payrate: ");
    double payRate = input.nextDouble();
    input.nextLine();

        double overtimePay = (hours - 40) * payRate * 1.5;
        if(hours > 40) {
            System.out.println("Overtime detected, your bonus pay is: " + overtimePay);
            System.out.println("Congrats " + name + " your pay is " + (40 * payRate));
        } else {
            System.out.println("Congrats " + name + " your pay is " + hours * payRate);
        }


    }
}
/*First declare name input so Scanner.input.in (string)
I need an int for hours worked
PAY RATE IS A FLOAT
Calculate gross pay
Sout Employees name and gross pay

*if statement for hours worked
m

 */
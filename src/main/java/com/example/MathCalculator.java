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
/*declare an int value for x
* declare an int value for y
* Scanner blank = new Scanner (System.in)
* *sout print a "First enter value X"
* X = scanner input     7
* sout print a "second enter value y"
Y= Scanner input       2
*blank.nextline
*
Sout print Possible Calculations
(A)dd
(S)ubtract
(M)ultiply
(D)ivide
 * Print sout "Select possible options"
 * String selected
 * scanner input of "Selected"
 While statement in case ASMD are not selected
 * then
 * print sout "ASMD not selected please try again
 * selected = scanner input
 *
 *
 * float output;
 * If selected is A
 * Output = X + Y
 * sout " X  + " + " + Y + "=" Output"
 * else if(Selected = S)
 *  Output = X - Y
 * sout " X  + " - " + Y + "=" Output"
 * else if(Selected = M)
 *  Output = X * Y
 * sout " X  + " * " + Y + "=" Output"
 * else if(Selected = D)
 *  Output = X / Y
 * sout " X  + " / " + Y + "=" Output"
 *
 *
 *
 *
 */

}

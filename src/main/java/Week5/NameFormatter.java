package Week5;

import java.util.Objects;
import java.util.Scanner;

public class NameFormatter {

    public static String getFullName(String firstName, String lastName) {

        return "Your name is " + firstName + " " + lastName;
    }

    public static String getFullName(String prefix, String firstName, String lastName) {

        return "Your name is " + prefix + " " + firstName + " " + lastName;
    }

    public static String getFullName(String prefix, String firstName, String middleName, String lastName) {

        return "Your name is " + prefix + " " + firstName + " " + middleName + " " + lastName;
    }

    public static String getFullName(String prefix, String firstName, String middleName, String lastName, String suffix) {

        return "Your name is " + prefix + " " + firstName + " " + middleName + " " + lastName + " " + suffix;
    }

}

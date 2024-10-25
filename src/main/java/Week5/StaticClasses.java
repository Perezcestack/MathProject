package Week5;

import java.util.Scanner;

public class StaticClasses {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(NameFormatter.getFullName("Sir", "Cesar", "Gabriel", "Perez", "De Luna"));

    }
}

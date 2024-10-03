package com.example;
import java.util.Scanner;

public class cellPhoneApp {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //prompt cellphone details
        System.out.print("What is your serial number?: ");
        String serialNumber = input.nextLine();

        System.out.print("What is your phone model?: ");
        String model = input.nextLine();

        System.out.print("What is your carrier?: ");
        String carrier = input.nextLine();

        System.out.print("What is your phone number?: ");
        String phoneNumber = input.nextLine();

        System.out.print("What is your name?: ");
        String owner = input.nextLine();

        CellPhone cesar = new CellPhone();
        cesar.setSerialNumber(serialNumber);
        cesar.setCarrier(carrier);
        cesar.setModel(model);
        cesar.setPhoneNumber(phoneNumber);
        cesar.setOwner(owner);

        System.out.println("The serial number is: > " + cesar.getSerialNumber());
        System.out.println("The model of the phone is: > " + cesar.getModel());
        System.out.println("The carrier of the phone: > " + cesar.getCarrier());
        System.out.println("The phone number is: > " + cesar.getPhoneNumber());
        System.out.println("The owner of the phone is: > " + cesar.getOwner());
    }

}

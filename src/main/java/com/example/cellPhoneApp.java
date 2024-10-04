package com.example;
import java.util.Objects;
import java.util.Scanner;

public class cellPhoneApp {

    static Scanner input = new Scanner(System.in);

    public static void display(CellPhone cellPhone) {
        System.out.println("The serial number is: > " + cellPhone.getSerialNumber());
        System.out.println("The model of the phone is: > " + cellPhone.getModel());
        System.out.println("The carrier of the phone: > " + cellPhone.getCarrier());
        System.out.println("The phone number is: > " + cellPhone.getPhoneNumber());
        System.out.println("The owner of the phone is: > " + cellPhone.getOwner());
    }

    public static void main(String[] args) {
        //prompt cellphone details
        CellPhone cellPhone1 = createCellPhone();
        CellPhone cellPhone2 = createCellPhone();
        cellPhone1.dial(cellPhone2.getPhoneNumber());

    }
    public static CellPhone createCellPhone() {
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

        return cesar;
    }
}


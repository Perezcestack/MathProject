package carDealershipWorkshop;

import java.io.*;
import java.util.*;

public class UserInterface {
    ArrayList<Vehicle> inventory = new ArrayList<>();
    List <Dealership> dealerships= new ArrayList<>();
    List <Vehicle> dealerlist = new ArrayList<>();



    DealershipFileManager dealershipFileManager = new DealershipFileManager();


    public void init() {
        try {
            dealerships = dealershipFileManager.getDealership();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    public void display(){
        Scanner input = new Scanner(System.in);
        Boolean menu = true;
        while(menu){
            System.out.println("Hi welcome to the Car Dealership program");
            System.out.println("Here is a list of dealerships: ");
            System.out.println(dealerships.toString());
            System.out.println("Which would you like to see" + "(enter as a number)");
            String choice = input.nextLine();
            ArrayList<Vehicle> choiceDealership = dealerships.get(Integer.parseInt(choice)-1).getInventory();
            displayVehicles(choiceDealership);

            System.out.println("Would you like to see cars by\n(A) By Price?\n(B) By Make and Model?\n(C) By Year\n" +
                    "(D) By Color\n(E) By Mileage\n(F) By Vehicle Type\n(G) All vehicles ");
            String selection = input.nextLine();
            //display dealerships
            // make an if statement after asking them to pick

            switch(selection.toUpperCase()) {
                case "A": menu = false;


                    choiceDealership.sort((vehicle2, vehicle1) -> Double.compare(vehicle1.getPrice(), vehicle2.getPrice()));
                    for(Vehicle vehicle: choiceDealership){
                        System.out.println(vehicle);
                    }

                break;

                case "B":

                    choiceDealership.sort((vehicle1, vehicle2)-> (vehicle1.getMake() + vehicle1.getModel()).compareTo(vehicle2.getMake() + vehicle2.getModel()));
                    for(Vehicle vehicle: choiceDealership) {
                        System.out.println(vehicle);
                    }
            }

        }


    }
    private void displayVehicles(ArrayList<Vehicle> vehicles){
       for(Vehicle v : vehicles){
           System.out.println(v);
       }
    }
    public void processAllVehicles(){
        displayVehicles(dealerships.get(0).getAllVehicles());
    }


}

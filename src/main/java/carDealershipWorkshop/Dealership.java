package carDealershipWorkshop;

import java.util.ArrayList;

public class Dealership {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Vehicle> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Vehicle> inventory) {
        this.inventory = inventory;
    }


    public Dealership(String name, String address, String phone, ArrayList<Vehicle> inventory) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return  name;
    }

    private String name;
    private String address;
    private String phone;
    ArrayList<Vehicle> inventory = new ArrayList<>();


    public void addVehicle(Vehicle vehicle){

    }

    public ArrayList<Vehicle> getAllVehicles(){

    return inventory;
    }
}

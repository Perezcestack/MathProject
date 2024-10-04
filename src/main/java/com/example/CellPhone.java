package com.example;

public class CellPhone {
    private String serialNumber = "0";
    private String model = "";
    private String carrier = "";
    private String phoneNumber = "";
    private String owner = "";

public void dial(String phoneNumber){
    System.out.println(owner + " is calling " + phoneNumber );
}
    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public CellPhone() {
    }

    public CellPhone(String serialNumber, String model, String carrier, String phoneNumber, String owner, String dial){
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

}

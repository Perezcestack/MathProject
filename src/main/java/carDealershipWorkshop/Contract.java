package carDealershipWorkshop;

public abstract class Contract {
    public Contract(String dateSigned, String customerName, String customerEmail, Vehicle vehicleSold) {
        this.dateSigned = dateSigned;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.vehicleSold = vehicleSold;
    }

    public String getDateSigned() {
        return dateSigned;
    }

    public void setDateSigned(String dateSigned) {
        this.dateSigned = dateSigned;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public Vehicle getVehicleSold() {
        return vehicleSold;
    }

    public void setVehicleSold(Vehicle vehicleSold) {
        this.vehicleSold = vehicleSold;
    }

    private String dateSigned;
    private String customerName;
    private String customerEmail;
    private Vehicle vehicleSold;
    private double totalPrice;
    private double monthlyPayment;

    public abstract void getTotalPrice();

    public abstract void getMonthlyPayment();

}

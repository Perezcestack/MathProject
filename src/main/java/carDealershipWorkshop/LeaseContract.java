package carDealershipWorkshop;

public class LeaseContract extends Contract{
    public static final double LEASE_FEE = 1.07;
    public static final double INTEREST_RATE = 1.04;
    public static final int MONTHS = 36;
    public final double endingValue = getPrice() * 0.50;
    private double totalFees = getPrice() * LEASE_FEE + endingValue;

    public LeaseContract(String dateSigned, String customerName, String customerEmail, Vehicle vehicleSold) {
        super(dateSigned, customerName, customerEmail, vehicleSold);
    }

    @Override
    public void getTotalPrice() {
        totalFees = getPrice() * LEASE_FEE + endingValue;
        System.out.println(totalFees + " is the total price.");
    }

    @Override
    public void getMonthlyPayment() {
        double monthlyPayment = totalFees * Math.pow(INTEREST_RATE,MONTHS);
        System.out.println(monthlyPayment + " is your monthly payment.");
    }

    public double getPrice() {
        return getVehicleSold().getPrice();
    }

}

package carDealershipWorkshop;

import java.util.Scanner;

public class SalesContract extends Contract {
    public static final int RECORDING_FEE = 100;
    public static final int PROCESSING_FEE_SMALL = 295;
    public static final int PROCESSING_FEE_DEFAULT = 495;
    public static final double SALES_TAX = 1.05;
    public static final double INTEREST_RATE_SMALL = 1.0425;
    public static final double INTEREST_RATE_DEFAULT = 1.0525;
    public static final int MONTH_OPTION_OVER_MARGIN = 48;
    public static final int MONTH_OPTION_UNDER_MARGIN = 24;
    public static final int PRICE_MARGIN = 10000;

    private boolean financing;

    public SalesContract(String dateSigned, String customerName, String customerEmail, Vehicle vehicleSold, boolean financing) {
        super(dateSigned, customerName, customerEmail, vehicleSold);
        this.financing = financing;
    }

    public boolean isFinancing() {
        return financing;
    }

    public void setFinancing(boolean financing) {
        this.financing = financing;
    }


    @Override
    public void getTotalPrice() {
        double interestRate = getPrice() >= PRICE_MARGIN ? INTEREST_RATE_SMALL : INTEREST_RATE_DEFAULT;
        double total;
        double preFeeTotal = getPrice() * Math.pow(interestRate, getMonths());
        if (getPrice() >= PRICE_MARGIN) {
            total = preFeeTotal + RECORDING_FEE + PROCESSING_FEE_SMALL * SALES_TAX;
        } else {
            total = preFeeTotal + RECORDING_FEE + PROCESSING_FEE_DEFAULT * SALES_TAX;
        }
        System.out.println(total + " is your total price");
    }

    @Override
    public void getMonthlyPayment() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to finance? Y/ N");
        String choice = scanner.nextLine().toLowerCase();
        if (choice.equals("y")) {
            double total = getPrice() >= PRICE_MARGIN ? getPrice() * Math.pow(INTEREST_RATE_SMALL, getMonths()) : getPrice() * Math.pow(INTEREST_RATE_DEFAULT, getMonths());
            double monthlyPay = total / getMonths();
            System.out.println("Your monthly payment is " + monthlyPay + " and the total amount is " + total);
        } else
            System.out.println("You have 0 monthly payments");
    }

    public int getMonths() {
        return (getPrice() >= PRICE_MARGIN) ? MONTH_OPTION_OVER_MARGIN : MONTH_OPTION_UNDER_MARGIN;

    }

    public double getPrice() {
        return getVehicleSold().getPrice();
    }
}



package Week5;

import java.util.Objects;

public class Reservation {
    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        double price = 139.00 * numberOfNights;
        if(roomType.equals("double")){
            price = 124.00;
        }
        if(isWeekend) {
            price *= 1.10;
        }

        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend = false;

    @Override
    public String toString() {
        return "Reservation{" +
                "roomType='" + roomType + '\'' +
                ", numberOfNights=" + numberOfNights +
                ", isWeekend=" + isWeekend +
                '}';
    }
}



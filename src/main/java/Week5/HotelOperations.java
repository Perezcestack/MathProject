package Week5;

import java.util.Scanner;

public class HotelOperations {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Room hotelLinc = new Room(2, 400.00, false, false);
        Reservation hotelLincRes = new Reservation("king", 5,false);
        System.out.println(hotelLinc + " " + "The hotel is available? " + hotelLinc.isAvailable());
        System.out.println("Thank you for checking in");

        hotelLinc.checkIn();

        System.out.println(hotelLinc + "Thank you for staying have a nice day!");

        hotelLinc.checkOut();

        System.out.println("Hotel room has been cleaned and is ready for next customer !");

        System.out.println(hotelLinc + " " + "The hotel room is available = " + hotelLinc.isAvailable());


        Employee cesar = new Employee(21,"Yo Mama","40.00",10, 50);
        System.out.println("Your regular hours are " + cesar.getRegularHours()+ " " +"Your total pay is " + cesar.getTotalPay()+ " " + "Your OT hours are " + cesar.getOvertimeHours() + " " + cesar.punchTimeCard());


    }
}

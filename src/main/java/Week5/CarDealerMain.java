package Week5;

import java.io.IOException;
import java.util.ArrayList;

public class CarDealerMain {
    public static void main(String[] args) throws IOException {
        ArrayList<Vehicle> inventory = new ArrayList<>();
        Vehicle vehicle = new Vehicle(2214245, 2024,"Maserati","mc20","4wheeler","white",204,50000.00);
        inventory.add(vehicle);
        Dealership dealership = new Dealership("D & B Used Cars","821 main street","4122552145",inventory);

        DealershipFileManager dealershipFileManager = new DealershipFileManager();

        dealershipFileManager.getDealership();



    }
}

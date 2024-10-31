package Week6;

import java.util.Map;

public class garageMain {

    public static void main(String[] args) {

        Moped slowride = new Moped();

        slowride.setColor("Red");
        slowride.setFuelCapacity(5);

        SemiTruck trucker = new SemiTruck();
        trucker.setNumberOfPassengers(7);

        Car carro = new Car();
        carro.setFuelCapacity(3);

    }
}

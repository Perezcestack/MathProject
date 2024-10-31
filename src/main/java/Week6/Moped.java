package Week6;

public class Moped extends Vehicles {
    private int wheels;

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int weight, int wheels) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, weight);
        this.wheels = wheels;
    }

    public Moped() {
        super();
    }
}

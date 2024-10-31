package Week6;

public class Car extends Vehicles{
    private Boolean electric;

    public Car(Boolean electric) {
        this.electric = electric;
    }

    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int weight, Boolean electric) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, weight);
        this.electric = electric;
    }

    public Car() {

    }
}

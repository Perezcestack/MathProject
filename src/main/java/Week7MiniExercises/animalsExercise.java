package Week7MiniExercises;

public abstract class animalsExercise {
    private String name;
    private double weight;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public abstract void eat();
    public abstract void breathe();
}


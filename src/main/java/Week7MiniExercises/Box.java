package Week7MiniExercises;

public class Box <T> {
    public T getContents() {
        return contents;
    }

    public void setContents(T contents) {
        this.contents = contents;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Box{" +
                "contents=" + contents +
                ", weight=" + weight +
                '}';
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    private T contents;
    private double weight;

    public void displayContents(){
        System.out.println();
    }

    public void setContents(int i, int i1) {
    }
}

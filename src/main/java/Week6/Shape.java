package Week6;

public class Shape {
    public Shape() {

    }

    public double getSides() {
        return sides;
    }

    public void setSides(double sides) {
        this.sides = sides;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape(int sides, String color) {
        this.sides = sides;
        this.color = color;
    }

    private double sides;
    private String color;

public void calculateArea(){
    System.out.println("a line");
}
public void calculateCircumference(){
    System.out.println("a line");
}
}

package Week6;

public class Circle extends Shape{
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private double radius;

    @Override
    public void calculateCircumference() {
        double pi = Math.PI;
        double result = pi * Math.pow(getRadius(),2);
        System.out.println(result);
    }
}

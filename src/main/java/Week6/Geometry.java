package Week6;

public class Geometry {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        Shape s2 = new Square();
        Circle s3 = new Circle();



        s2.setSides(4);
        s2.calculateArea();

        s3.setRadius(5);

        s3.calculateCircumference();
        

    }
}

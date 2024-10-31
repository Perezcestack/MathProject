package Week6;

public class Square extends Shape {
    public int getSideSize() {
        return sideSize;
    }

    public void setSideSize(int sideSize) {
        this.sideSize = sideSize;
    }

    private int sideSize;

    @Override
    public void calculateArea() {
        double result = Math.pow(getSides(),2);
        System.out.println(result);
    }
}

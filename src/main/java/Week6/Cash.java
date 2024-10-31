package Week6;

public class Cash extends Asset2{

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public Cash(String description, String dateAcquired, double originalCost, int dinero) {
        super(description, dateAcquired, originalCost);
        this.dinero = dinero;
    }

    private int dinero;


    @Override
    public int getValue2() {
        return super.getValue();
    }
}

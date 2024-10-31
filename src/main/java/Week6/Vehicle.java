package Week6;

public class Vehicle extends Asset {
    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    private String makeModel;
    private int year;
    private int odometer;

    @Override
    public double getValue() {
        double result;


        if(year <= 3){
            result = getOriginalCost()  * 0.97;
        } else if (year <= 6){
            result = getOriginalCost()  * 0.94;
        } else if (year <= 10){
            result = getOriginalCost()  * 0.92;
        }else {
            result = 1000;

        }
        if (odometer >= 100000 && !makeModel.contains("Honda") && !makeModel.contains("Toyota")) {
        result = result * .75;
        }

        return result;
    }
}

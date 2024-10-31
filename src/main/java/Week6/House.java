package Week6;

public class House extends Asset {
    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;


    @Override
    public double getValue(){
        double result;
        double squareValue;

        if(condition == 4) {
            squareValue = 180.0 * squareFoot;
        }else if (condition == 3){
           squareValue = 130.0 * squareFoot;
        }else if (condition == 2){
            squareValue = 90.0 * squareFoot;
        }else if (condition == 1){
           squareValue = 80.0 * squareFoot;
        }else{
           squareValue = 0.0;
            System.out.println("That value isnt valid please enter 1-4");
        }
        double lotSizeCalc = .25 * lotSize;
        result = lotSizeCalc + squareValue;

        return result;
    }



}

package Week5;

public class Card {

    private String suit;
    private String value;
    private boolean isFaceUp;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false;
    }

    public String getSuit(){
        // only return the suit if the card is face up
        if(isFaceUp){
            return suit;
        } else {
            return "#";
        }
    }
    public String getValue(){
        // only return the value if the card is face up
        if(isFaceUp){
        // this is the string value of the card
        // i.e. A, K, Q, J, 10, 9 ...
            return value;
        } else {
            return "#";
        }
    }
    public int getPointValue() {
        // only return the value if the card is face up
        // determine point value and return it
        // A = 11
        // K, Q, J = 10
        // all numeric cards are equal to their face value
        if (isFaceUp) {
            if (value.equalsIgnoreCase("A")) {
                return 11;
            } else if (value.equalsIgnoreCase("K") || value.equalsIgnoreCase("Q")
                    || value.equalsIgnoreCase("J")) {
                return 10;
            }else {
                return Integer.parseInt(value);
            }

        }
        else {
            return 0;
    }
}


    public boolean isFaceUp(){
        return isFaceUp;
    }
    public void flip(){
        isFaceUp = !isFaceUp;
    }
}

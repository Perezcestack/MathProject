package Week5;

public class Player {

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Player(String playerName, Hand hand) {
        this.playerName = playerName;
        this.hand = hand;
    }

    private String playerName;
    private Hand hand;

    public Player(Hand hand) {
        this.hand = hand;
    }


    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }


}

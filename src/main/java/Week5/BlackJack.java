package Week5;

import java.util.ArrayList;
import java.util.Scanner;

public class BlackJack {
    ArrayList<Player> players;

    static Scanner input = new Scanner(System.in);
        public static void main(String[] args) {
            //dealers hand
            Deck deck = new Deck();
            deck.shuffle();
            //players hand
            Deck deck2 = new Deck();
            deck2.shuffle();

            //initializing hands
            Hand hand1 = new Hand();
            Hand hand2 = new Hand();

            System.out.println("What is your player name? ");
            Player player = new Player(input.nextLine(), hand2);

            // deal 2 cards
            for(int i = 0; i < 2; i++) {
                Card card1 = deck.deal();
                //player cards
                player.getHand().deal(card1);

            // get a card from the deck
                Card card = deck.deal();
            // deal that card to the hand
                hand1.deal(card);
            }

            int handValue = hand1.getValue();
            int playerValue = hand2.getValue();

            System.out.println(player.getPlayerName() + "'s hand is worth " + playerValue + " "  + "(" + hand2.printCards() + ")" );
            System.out.println("Do you want to hit or stand?");
            String hitOrStand = input.nextLine();

            if(hitOrStand.equalsIgnoreCase("Hit")){

                System.out.println(playerValue);
            }
            System.out.println("This dealers hand is worth " + handValue + " "  + "(" + hand1.printCards() + ")" );
            if(playerValue > 21){
                System.out.println("You bust, Sorry!");
            }
            if(handValue > 21){
                System.out.println("You bust, Sorry!");
            }

            if(playerValue < handValue){
                System.out.println("The dealer has won this round Please try again");
            }else if (playerValue < 21 && playerValue > handValue){
                System.out.println(player.getPlayerName() + " has won this round Great job");
            }
        }


        public static void newPlayers(String name,Hand hand){
            System.out.println("Is there another player? Yes or No");
            String selection = input.nextLine();

            if(selection.equalsIgnoreCase("Yes")){
                Player player1 = new Player(input.nextLine(), new Hand());
            }else {
                System.out.println("Perfect moving onto the game! ");
            }

        }



    }


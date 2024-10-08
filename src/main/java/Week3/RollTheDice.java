package Week3;

public class RollTheDice {

    static int i = 0;

    public void main(String[] args) {
        int roll1;
        int roll2;
        int result = 0;
        int count2 = 0;
        int count4 = 0;
        int count6 = 0;
        int count7 = 0;

        Dice dice = new Dice();

        for (i = 1; i < 101; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            result = roll1 + roll2;
            System.out.println("Round " + i + "\n\n" + "Dice 1: " + roll1 + "\n" + "Dice 2: " + roll2 + "\n" + "Result: " + result);
            System.out.println("---------------------------------------");


        }
        if (result == 2) {
            count2++;
        } else if (result == 4) {
            count4++;
        } else if (result == 6) {
            count6++;
        } else if (result == 7) {
            count7++;
        }
        System.out.println("2 rolled " + count2 + " times!");
        System.out.println("4 rolled " + count4 + " times!");
        System.out.println("6 rolled " + count6 + " times!");
        System.out.println("7 rolled " + count7 + " times!");

    }
        }

class Dice {
    public int roll() {
        return (int) (Math.random() * 6) + 1;
    }
}


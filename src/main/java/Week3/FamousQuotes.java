package Week3;

import java.util.Scanner;

public class FamousQuotes {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            String[] famousQuotes = {"It is better to have died on your feet than live on your knees", "It's always impossible until its done,",
                    "I am not a product of my circumstances. I am a product of my choices", "He who has a why to live can bear almost any how.",
                    "You miss 100% of the shots you don't take.", "You can't cross the sea merely by standing and staring at the sea.",
                    "Hope is a weapon stronger than any blade", "What you fear is also what will save you", "Every end is a new beginning",
                    "Great things never came from comfort zones."
            };

            System.out.print("Pick a number ranging 1-10: ");
            String select = input.nextLine();

            int selectedNumber = Integer.parseInt(select);
            //declare another string here
            String another;

            String quotes = (famousQuotes[selectedNumber - 1]);


            System.out.println("You selected: " + quotes);

            System.out.println("Would you like to pick another? (y/n) ");
            another = input.nextLine();
            //leave input.next line up

            if(another.equals("y")){
                do{
                    System.out.print("Pick a number ranging 1-10: ");
                    input.nextLine();

                    System.out.println("You selected: " + quotes);

                    System.out.println("Would you like to pick another? (y/n) ");
                   another = input.nextLine();

                } while (another.equals("y"));
            }
        }
        catch (Exception e) {
            System.out.println("Your number didn't match our range! Try again");
            e.printStackTrace();
        }

            }
    }



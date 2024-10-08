package Week3;

import java.util.Scanner;

public class SportsPlayerAPP {

   static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // instantiating object to be able to call function below
        SportsPlayer players = new SportsPlayer();

        SportsPlayer player1 = createSportsPlayer();
        SportsPlayer player2 = createSportsPlayer();
        player1.playsFor(player1.getName() + player1.getTeam());

        System.out.print("The player's name is: " + players.getName());
        System.out.print("The player's team is: " + players.getTeam());
        System.out.print("The player's sport is: " + players.getSport());
        System.out.print("The player's date of birth is: " + players.getDateOfBirth());
        System.out.print("The player's height is: " + players.getHeight());

    }

    public static SportsPlayer createSportsPlayer(){
        System.out.print("What is the players name?: ");
        String name = input.nextLine();

        System.out.print("What is the players team?: ");
        String team = input.nextLine();

        System.out.print("What is the team color?: ");
        String teamColor = input.nextLine();

        System.out.print("What is the players sport?: ");
        String sport = input.nextLine();

        System.out.print("What is the players date of birth?: ");
        String dateOfBirth = input.nextLine();

        System.out.print("What is the players height?: ");
        String height = input.nextLine();

        SportsPlayer player1 = new SportsPlayer();
        player1.setName(name);
        player1.setTeam(team);
        player1.setSport(sport);
        player1.setDateOfBirth(dateOfBirth);
        player1.setHeight(height);
        player1.setTeamColor(teamColor);

        return player1;
    }
}

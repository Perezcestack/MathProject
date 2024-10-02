package com.example;
import java.util.Scanner;

public class HighScoreWins {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // I need to grab user input

        System.out.println("Please enter your score from the game in the following format (Home:Visitor | 21:9) ");
        String [] origin = input.nextLine().split("\\|");//split pipe

        String firstSection = origin[0]; // Making a firstSection array to be able to split it at the :
        String[] teams = firstSection.split(":");

        String team1 = teams[0];
        String team2 = teams[1];


        String secondSection = origin[1];
        String[] scores = secondSection.trim().split(":");

        Integer.parseInt(scores[0]);
        Integer.parseInt(scores[1]);


        int score1 = Integer.parseInt(scores[0]);
        int score2 = Integer.parseInt(scores[1]);

        if(score1 < score2){
            System.out.println("Congrats! The final score is " + team1 + score1 + " vs " + team2 + score2);
            System.out.println("The winner is " + team2);
        } else if (score2 < score1) {
            System.out.println("Congrats! The final score is " + team1 + score1 + " vs " + team2 + score2);
            System.out.println("The winner is " + team1);

        } else if(score1 == score2){
            System.out.println("Congrats! The final score is " + team1 + score1 + " vs " + team2 + score2);
            System.out.println("Its a draw");
        }


    }
}

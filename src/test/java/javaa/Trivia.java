package javaa;

import java.util.Scanner;

public class Trivia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score = 0;
        System.out.println("1. which country held the 2016 summer olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
        String ansOne = sc.nextLine();

        System.out.println("\n 2) which planet is the hottest?");
        System.out.println("\ta)Venus \tb)saturn \tc)mercury \td)Mars");
        String twoAns = sc.nextLine();

        System.out.println("\n What is the rarest blood type?");
        System.out.println("\ta)O \tb)A \tc)B \td)AB-negative");
        String thirdAns = sc.nextLine();

        System.out.println("\n4) Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta)Ron Weasley \tb)Hermione Granger \tc) Draco Malfoy ");
        String fourAns = sc.nextLine();
        if (ansOne.equals("c")) {
            score +=5;
        }
        if (twoAns.equals("a")) {
            score+=5;
        }
        if (thirdAns.equals("d")){
            score+=5;
        }
        if (fourAns.equals("a") || fourAns.equals("b")) {
            score+=5;
        }

        System.out.println("Your score " +score+ " /20");

        if (score >= 15) {
            System.out.println("Wow, you know your stuff!");
        } else if (score > 5 && score < 15 ) {
            System.out.println("Not bad!");
        } else {
            System.out.println("better luck next time.");
        }
    }
}

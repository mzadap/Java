package Bootcamp.project;

import java.awt.*;
import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Java Casino!");
        System.out.println("Do you have a knack for black jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin");
        scan.nextLine();
        int yourCard1 = drawRandomCard();
        int yourCard2 = drawRandomCard();
        int a = Math.min(yourCard1, yourCard2);
        String randomCard1 = drawingCard(yourCard1);
        String randomCard2 = drawingCard(yourCard2);
        System.out.println("You get a " + randomCard1);
        System.out.println("and a " + randomCard2);
        int dealer = drawRandomCard();
        String dealerCard = drawingCard(dealer);
        System.out.println("The Dealer shows " + dealerCard + "\n and a card facing down " + faceDown());

        if (yourCard1 == 11 || yourCard1 == 12 || yourCard1 == 13) {
            yourCard1 = 10;
        }
        if (yourCard2 == 11 || yourCard2 == 12 || yourCard2 == 13) {
            yourCard2 = 10;
        }
        //System.out.println("Your total is : " + (yourCard1 + yourCard2));
        String choise = hitOrStay();


    }

    public static String hitOrStay() {
        System.out.println("Would you like to hit or stay");
               String userChoice = scan.nextLine();
        while (!(userChoice.equals("hit") || userChoice.equals("stay"))) {
            System.out.println("Please write hit or stay");
            userChoice = scan.nextLine();
        }
        return userChoice;

    }

    public static String faceDown() {
        return " \"                    \\\"   _____\\\\n\\\" +\\n\" +\n" +
                "                    \"                    \\\"  |  J  |\\\\n\\\"+ \\n\" +\n" +
                "                    \"                    \\\"  | J J |\\\\n\\\"+ \\n\" +\n" +
                "                    \"                    \\\"  |J J J|\\\\n\\\"+ \\n\" +\n" +
                "                    \"                    \\\"  |  J  |\\\\n\\\"+ \\n\" +\n" +
                "                    \"                    \\\"  |__%%[|\\\\n\\\";\";\n";
    }
    public static int drawRandomCard() {
        double randomNumber = Math.random() * 13;
        randomNumber += 1;
        int card = (int) randomNumber;
        return card;
    }

    public static String drawingCard(int card) {

        switch (card) {
            case 1: return
                    "                   \"   _____\\n\"+\n" +
                    "                   \"  |A _  |\\n\"+ \n" +
                    "                   \"  | ( ) |\\n\"+\n" +
                    "                   \"  |(_'_)|\\n\"+\n" +
                    "                   \"  |  |  |\\n\"+\n" +
                    "                   \"  |____V|\\n\";";

            case 2: return
                    "                    \"   _____\\n\"+              \n" +
                    "                    \"  |2    |\\n\"+ \n" +
                    "                    \"  |  o  |\\n\"+\n" +
                    "                    \"  |     |\\n\"+\n" +
                    "                    \"  |  o  |\\n\"+\n" +
                    "                    \"  |____Z|\\n\";";

            case 3: return
                    "                  \"   _____\\n\" +\n" +
                    "                  \"  |3    |\\n\"+\n" +
                    "                  \"  | o o |\\n\"+\n" +
                    "                  \"  |     |\\n\"+\n" +
                    "                  \"  |  o  |\\n\"+\n" +
                    "                  \"  |____E|\\n\";";

            case 4: return
                    "                   \"   _____\\n\" +\n" +
                    "                   \"  |4    |\\n\"+\n" +
                    "                   \"  | o o |\\n\"+\n" +
                    "                   \"  |     |\\n\"+\n" +
                    "                   \"  | o o |\\n\"+\n" +
                    "                   \"  |____h|\\n\";";

            case 5: return
                    "               \"   _____ \\n\" +\n" +
                    "                    \"  |5    |\\n\" +\n" +
                    "                    \"  | o o |\\n\" +\n" +
                    "                    \"  |  o  |\\n\" +\n" +
                    "                    \"  | o o |\\n\" +\n" +
                    "                    \"  |____S|\\n\";";

            case 6: return
                    "\"   _____ \\n\" +\n" +
                    "                    \"  |6    |\\n\" +\n" +
                    "                    \"  | o o |\\n\" +\n" +
                    "                    \"  | o o |\\n\" +\n" +
                    "                    \"  | o o |\\n\" +\n" +
                    "                    \"  |____6|\\n\";";

            case 7: return
                    "                    \"   _____ \\n\" +\n" +
                    "                    \"  |7    |\\n\" +\n" +
                    "                    \"  | o o |\\n\" +\n" +
                    "                    \"  |o o o|\\n\" +\n" +
                    "                    \"  | o o |\\n\" +\n" +
                    "                    \"  |____7|\\n\";";

            case 8: return
                    "                    \"   _____ \\n\" +\n" +
                    "                    \"  |8    |\\n\" +\n" +
                    "                    \"  |o o o|\\n\" +\n" +
                    "                    \"  | o o |\\n\" +\n" +
                    "                    \"  |o o o|\\n\" +\n" +
                    "                    \"  |____8|\\n\";";

            case 9: return
                    "                    \"   _____ \\n\" +\n" +
                    "                    \"  |9    |\\n\" +\n" +
                    "                    \"  |o o o|\\n\" +\n" +
                    "                    \"  |o o o|\\n\" +\n" +
                    "                    \"  |o o o|\\n\" +\n" +
                    "                    \"  |____9|\\n\";";

            case 10: return
                    "                    \"   _____ \\n\" +\n" +
                    "                    \"  |10  o|\\n\" +\n" +
                    "                    \"  |o o o|\\n\" +\n" +
                    "                    \"  |o o o|\\n\" +\n" +
                    "                    \"  |o o o|\\n\" +\n" +
                    "                    \"  |___10|\\n\";";

            case 11: return
                    "                    \"   _____\\n\" +\n" +
                    "                    \"  |J  ww|\\n\"+ \n" +
                    "                    \"  | o {)|\\n\"+ \n" +
                    "                    \"  |o o% |\\n\"+ \n" +
                    "                    \"  | | % |\\n\"+ \n" +
                    "                    \"  |__%%[|\\n\";";

            case 12: return
                    "                    \"   _____\\n\" +\n" +
                    "                    \"  |Q  ww|\\n\"+ \n" +
                    "                    \"  | o {(|\\n\"+ \n" +
                    "                    \"  |o o%%|\\n\"+ \n" +
                    "                    \"  | |%%%|\\n\"+ \n" +
                    "                    \"  |_%%%O|\\n\";";

            case 13: return
                    "                    \"   _____\\n\" +\n" +
                    "                    \"  |K  WW|\\n\"+ \n" +
                    "                    \"  | o {)|\\n\"+ \n" +
                    "                    \"  |o o%%|\\n\"+ \n" +
                    "                    \"  | |%%%|\\n\"+ \n" +
                    "                    \"  |_%%%>|\\n\";";

            default: return "4044";
        }
    }
}

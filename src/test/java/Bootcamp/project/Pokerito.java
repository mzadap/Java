package Bootcamp.project;

import java.util.Scanner;

public class Pokerito {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's Play Pokerito. Type anything when you're ready");
        scan.nextLine();
        System.out.println("It's like Poker, but a lot simpler." + "\n - There are two players, you and the computer."
        + " - The dealer will give each player one card.\n" + "\n Then, the dealer will draw five cards (the river)"
        + " The player with the most river matches wins!\n" + " -If the matches are equal, everyone's a winner!\n"
        + "  Ready? Type anything if you are.\n");
        scan.nextLine();
        String dealerCard = null;
        String yourCard = randomCard();
        System.out.println("Here is your card " + yourCard);
        String computerCard = randomCard();
        System.out.println("Here's the computer's card " + computerCard);
        int yourMatch = 0;
        int computerMatch = 0;
        System.out.println("Now, the dealer will draw five cards. Press enter to continue.");
        for (int i=1; i<=5; i++) {
            System.out.println("card " + i);
            scan.nextLine();
            dealerCard = randomCard();
            System.out.println(dealerCard);
            if (dealerCard.equals(yourCard)) {
                yourMatch++;
            }
            if (dealerCard.equals(computerCard)) {
                computerMatch++;
            }
        }
        System.out.println("Your number of matches: " + yourMatch);
        System.out.println("Computer number of matches :" + computerMatch);
        if (yourMatch > computerMatch) {
            System.out.println("You win!!");
        } else if (computerMatch > yourMatch) {
            System.out.println("Computer win!!");
        } else {
            System.out.println("Everyone wins");
        }


    }

    public static String randomCard() {
        double random = Math.random() * 13;
        random += 1;
        int random1 = (int)random;
        System.out.println(random1);
        switch (random1) {
            case 1: return             "\"   _____\\n\"+\n" +
                    "                   \"  |A _  |\\n\"+ \n" +
                    "                   \"  | ( ) |\\n\"+\n" +
                    "                   \"  |(_'_)|\\n\"+\n" +
                    "                   \"  |  |  |\\n\"+\n" +
                    "                   \"  |____V|\\n\";";

                case 2: return          "\"   _____\\n\"+              \n" +
                    "                    \"  |2    |\\n\"+ \n" +
                    "                    \"  |  o  |\\n\"+\n" +
                    "                    \"  |     |\\n\"+\n" +
                    "                    \"  |  o  |\\n\"+\n" +
                    "                    \"  |____Z|\\n\";";

            case 3: return "           \"   _____\\n\" +\n" +
                    "                  \"  |3    |\\n\"+\n" +
                    "                  \"  | o o |\\n\"+\n" +
                    "                  \"  |     |\\n\"+\n" +
                    "                  \"  |  o  |\\n\"+\n" +
                    "                  \"  |____E|\\n\";";

            case 4: return             "\"   _____\\n\" +\n" +
                    "                   \"  |4    |\\n\"+\n" +
                    "                   \"  | o o |\\n\"+\n" +
                    "                   \"  |     |\\n\"+\n" +
                    "                   \"  | o o |\\n\"+\n" +
                    "                   \"  |____h|\\n\";";

            case 5: return             " \"   _____ \\n\" +\n" +
                    "                    \"  |5    |\\n\" +\n" +
                    "                    \"  | o o |\\n\" +\n" +
                    "                    \"  |  o  |\\n\" +\n" +
                    "                    \"  | o o |\\n\" +\n" +
                    "                    \"  |____S|\\n\";";

            case 6: return             " \"   _____ \\n\" +\n" +
                    "                    \"  |6    |\\n\" +\n" +
                    "                    \"  | o o |\\n\" +\n" +
                    "                    \"  | o o |\\n\" +\n" +
                    "                    \"  | o o |\\n\" +\n" +
                    "                    \"  |____6|\\n\";";

            case 7: return           "   \"   _____ \\n\" +\n" +
                    "                    \"  |7    |\\n\" +\n" +
                    "                    \"  | o o |\\n\" +\n" +
                    "                    \"  |o o o|\\n\" +\n" +
                    "                    \"  | o o |\\n\" +\n" +
                    "                    \"  |____7|\\n\";";

            case 8: return              "\"   _____ \\n\" +\n" +
                    "                    \"  |8    |\\n\" +\n" +
                    "                    \"  |o o o|\\n\" +\n" +
                    "                    \"  | o o |\\n\" +\n" +
                    "                    \"  |o o o|\\n\" +\n" +
                    "                    \"  |____8|\\n\";";

            case 9: return "\n" +
                    "                    \"   _____ \\n\" +\n" +
                    "                    \"  |9    |\\n\" +\n" +
                    "                    \"  |o o o|\\n\" +\n" +
                    "                    \"  |o o o|\\n\" +\n" +
                    "                    \"  |o o o|\\n\" +\n" +
                    "                    \"  |____9|\\n\";";

            case 10: return            " \"   _____ \\n\" +\n" +
                    "                    \"  |10  o|\\n\" +\n" +
                    "                    \"  |o o o|\\n\" +\n" +
                    "                    \"  |o o o|\\n\" +\n" +
                    "                    \"  |o o o|\\n\" +\n" +
                    "                    \"  |___10|\\n\";";

            case 11: return           "  \"   _____\\n\" +\n" +
                    "                    \"  |J  ww|\\n\"+ \n" +
                    "                    \"  | o {)|\\n\"+ \n" +
                    "                    \"  |o o% |\\n\"+ \n" +
                    "                    \"  | | % |\\n\"+ \n" +
                    "                    \"  |__%%[|\\n\";";

            case 12: return "            \"   _____\\n\" +\n" +
                    "                    \"  |Q  ww|\\n\"+ \n" +
                    "                    \"  | o {(|\\n\"+ \n" +
                    "                    \"  |o o%%|\\n\"+ \n" +
                    "                    \"  | |%%%|\\n\"+ \n" +
                    "                    \"  |_%%%O|\\n\";";

            case 13: return            " \"   _____\\n\" +\n" +
                    "                    \"  |K  WW|\\n\"+ \n" +
                    "                    \"  | o {)|\\n\"+ \n" +
                    "                    \"  |o o%%|\\n\"+ \n" +
                    "                    \"  | |%%%|\\n\"+ \n" +
                    "                    \"  |_%%%>|\\n\";";

            default: return "4044";
        }
    }
}

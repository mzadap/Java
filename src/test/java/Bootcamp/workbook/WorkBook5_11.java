package Bootcamp.workbook;

import java.util.Scanner;

public class WorkBook5_11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int points = 0;
        System.out.println("Lets play Rolling Java. Type anything to start.\n");
        System.out.println("Great, here are the rules:\n");
        System.out.println("If you roll a 6 the game stops.");
        System.out.println("If you roll a 4 nothing happens.");
        System.out.println("Otherwise, you get 1 point\n");
        System.out.println("You must collect at least 3 points to win. Enter anything to roll:");
        String last = scanner.nextLine();
        while (true) {
            //scanner.nextLine();
            int diceRoll = rollDice();
            //System.out.print("\n You Rolled " + diceRoll + ". One point. Keep rolling\n");
            //points++;
            if (diceRoll == 4) {
                System.out.print("You rolled a " + diceRoll + " Zero points. Keeps rolling.\n");
            } else if (diceRoll==6) {
                System.out.print("You rolled a " + diceRoll + "End of game\n");
                System.out.println("Your Score " + points);
                break;
            } else {

                System.out.print("You Rolled " + diceRoll + ". One point. Keep rolling\n");
                points++;
            }


        }
        if (points >= 3 ) {
            System.out.println("Wow, that's lucky. You win!");
        } else {
            System.out.println("Tough luck, you lose :(");
        }
    }

    public static int rollDice() {
        double random = Math.random() * 7;
        return (int) random;
    }
}

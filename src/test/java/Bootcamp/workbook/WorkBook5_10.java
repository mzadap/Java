package Bootcamp.workbook;

public class WorkBook5_10 {

    public static void main(String[] args) {

        int dice1 = rollDice();
        int dice2 = rollDice();
        System.out.println("Dice 1 :" + dice1 );
        System.out.println("Dice 2 :" + dice2 + "\n");
        while (!(dice1 == dice2)) {
            dice1 = rollDice();
            dice2 = rollDice();
            System.out.println("Dice 1 :" + dice1 );
            System.out.println("Dice 2 :" + dice2 + " \n");
        }
        System.out.println("You Rolled doubles!");

    }

    public static int rollDice() {
        double random = Math.random() * 7;
        return (int) random;
    }
}

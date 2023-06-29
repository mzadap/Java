package Bootcamp.project;

import java.util.Scanner;

public class DiceJack {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();
        System.out.println(roll1);
        System.out.println(roll2);
        System.out.println(roll3);

        System.out.println("Enter three numbers between 1 and 6");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 <0 || num2 <0 || num3 <0) {
            System.out.println("Number cannot be less than zero. Shutng down");
        }

        if (num1 >6 || num2 >6 || num3 >6) {
            System.out.println("Number cannot be less than zero. Shutng down");
            System.exit(400);
        }

        int sumOfNumbers = num1 + num2 + num3;
        int sumOfDice = roll1 + roll2 + roll3;

        System.out.println("Dice sum = " + sumOfDice + " Number sum = " + sumOfNumbers);

        if (checkWin(sumOfDice, sumOfNumbers)) {
            System.out.println("Congrats you win");
        } else {
            System.out.println("You lose!!");
        }

    }

    public static int rollDice() {
        double randomNumber = Math.random() * 6;
        randomNumber += 1;
        return (int) randomNumber;
    }

    public static boolean checkWin(int sumOfDice, int sumOfNumbers) {
        return sumOfNumbers > sumOfDice && sumOfNumbers - sumOfDice < 3;
    }
}

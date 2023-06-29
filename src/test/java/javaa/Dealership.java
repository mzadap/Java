package javaa;

import java.util.Scanner;

public class Dealership {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println( "\nWelcome to Java Dealership app");
        System.out.println("Select option a. Buy a car");
        System.out.println("select option b. Sell a car");
        String options = sc.nextLine();
        switch (options) {
            case "a":
                System.out.println("You choose option " + options);
                System.out.println("What is your budget?");
                int budget = sc.nextInt();
                if (budget >=6000) {
                    System.out.println("Great! TATA punch is available");
                    System.out.println("\n DO you have Insurance? (Yes or No)");
                    sc.nextLine();
                    String insurance = sc.nextLine();
                    System.out.println("\n do you have license? (Yes or No)");
                    String license = sc.nextLine();
                    System.out.println("\nWhat is ur credit score?");
                    int creditScore = sc.nextInt();
                    if (insurance.equals("yes") && license.equals("yes") && creditScore > 500) {
                        System.out.println("sold! Pleasure doing business with you");
                    } else {
                        System.out.println("We're sorry. You are not eligible");
                    }
                } else {
                    System.out.println("We don't sell car under $6000");
                }
                break;
            case "b":
                System.out.println("You choose option " + options);
                System.out.println("What is ur car value at?");
                int value = sc.nextInt();
                System.out.println("What is ur selling price?");
                int price = sc.nextInt();
                if (value > price && price < 10000) {
                    System.out.println("We will buy this car. Pleasure doing it");
                } else {
                    System.out.println("Sorry, we're not interested");
                }
                break;
            default:
                System.out.println("Invalid options");
        }

    }
}

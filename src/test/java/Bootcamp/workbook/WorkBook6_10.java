package Bootcamp.workbook;

import java.util.Scanner;

public class WorkBook6_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many Pizza toppings do you want??");
        String[] toppings = new String[3];
        System.out.println("Great, enter each topping!");
        for (int i = 0; i < toppings.length; i++) {
            System.out.print(i + ". ");
            toppings[i] = scan.nextLine();
        }
        System.out.println("\nTHank you! Here are the topping your ordered");
        for (int i = 0; i<toppings.length; i++) {
            System.out.println(i + " . " + toppings[i]);
        }
        System.out.println("\nPress anything to confirm your order");
        scan.nextLine();
        System.out.println("Great, a driver is on the way!");
    }
}

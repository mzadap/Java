package Bootcamp.workbook;

import java.util.Scanner;

public class Workbook4_4 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nWhich animal would you like to draw ");
        System.out.println("\nWrite 1 for butterfly\nWrite 2 for elephant\nWrite 3 for bear\nWrite 4 for snake");
        int choice = scanner.nextInt();
        draw(choice);
    }

    public static void draw(int choice) {
        switch (choice) {
            case 1:
                System.out.println("---->");
                break;
            case 2:
                System.out.println("--------||--------");
                break;
            case 3:
                System.out.println("|||||||||||||||");
                break;
            case 4:
                System.out.println("----------------->");
                break;
            default:
                System.out.println("Invalid ");
        }
    }
}

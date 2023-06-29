package Bootcamp.workbook;

import java.util.Scanner;

public class WorkBook6_4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] aisles = {"apples", "Banans", "Candy", "Chocolate","coffee", "tea"};
        System.out.println("Welcome to java grocers");
        System.out.println("What can i help you find?");
        String userChoice = scan.nextLine();
        for (int i = 0; i < aisles.length; i++) {
            if (userChoice.equalsIgnoreCase(aisles[i])) {
                System.out.println("we have that in aisle " + i);
                break;
            }
        }
    }
}

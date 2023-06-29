package Bootcamp.workbook;

import java.util.Scanner;

public class WorkBook5_8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secrect = 4;
        System.out.println("I chose a number between 1 and 5. Try to guess it: ");
        int guess = scan.nextInt();
        while (! (secrect == guess)) {
            System.out.println("guess again");
            guess = scan.nextInt();
        }
        System.out.println("You got it");
    }
}

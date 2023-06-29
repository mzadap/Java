package Bootcamp.workbook;

import java.util.Scanner;

public class WorkBook5_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want me to write?");
        String ans = scanner.nextLine();
        for (int i = 0; i<=99; i++) {
            System.out.println(ans + " " + i);
        }
    }
}

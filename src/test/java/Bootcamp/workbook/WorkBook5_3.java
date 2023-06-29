package Bootcamp.workbook;

import java.util.Scanner;

public class WorkBook5_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi Timmy! Choose a number to count to:");
        int value = scan.nextInt();
        System.out.println("Great! Here's how it's done");
        for (int i = 0 ; i<= value; i++) {
            System.out.print(i + "\t");
        }
    }
}

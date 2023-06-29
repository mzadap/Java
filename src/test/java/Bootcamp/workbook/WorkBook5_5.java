package Bootcamp.workbook;

import java.util.Scanner;

public class WorkBook5_5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by threes");
        System.out.println("Jimmy: it depands");
        System.out.println("oh, ok..");
        System.out.print("Pick a number to count by: " );
        int firstNumber = scan.nextInt();
        System.out.println("Pick a number to start counting from: ");
        int secondNumber = scan.nextInt();
        System.out.println("Pick a number to count: ");
        int thirdNumber = scan.nextInt();

        for (int i = secondNumber; i<=thirdNumber; i+=firstNumber) {
            System.out.print(i + " ");
        }
    }

}

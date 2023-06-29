package testing;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {

        int number;
        int sum = 0;
        int average = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter Number");
            boolean isNext = scanner.hasNextInt();
            if (isNext) {
                number = scanner.nextInt();
                sum += number;
                count++;

            }else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round(sum / count));
    }
}

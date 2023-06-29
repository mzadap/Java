package testing;

import java.util.Scanner;

public class MinandMax {

    public static void main(String[] args) {
        int number;
        int min = 0;
        int max = 0;
        int temp = 0;
        boolean first = true;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number");
            boolean isNext = scanner.hasNextInt();
            if (isNext){
                number = scanner.nextInt();
                temp = number;
                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }

                if (number > max) {
                    max = number;
                }

                if ( number < min) {
                    min = number;
                }
            }
            else {
                break;
            }
            scanner.nextLine();

        }
        System.out.println("min" + min + " max" + max);

    }
}

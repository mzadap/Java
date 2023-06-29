package codechef;

import java.util.Scanner;

public class Mahasena {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        int evenCount = 0;
        int oddCount = 0;
        for (int i =0; i<test; i++) {
            int n1 = scanner.nextInt();
            if (n1 % 2 == 0) {
                evenCount++;

            } else {
                oddCount++;

            }
        }
        if (evenCount > oddCount) {
            System.out.println("Ready");
        } else {
            System.out.println("Not Ready");
        }
    }
}

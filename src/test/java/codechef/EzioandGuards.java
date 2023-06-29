package codechef;

import java.util.Scanner;

public class EzioandGuards {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Enter no of iterations");
        int tc = scanner.nextInt();
        for (int i = 0; i< tc; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (x >= y) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

package codechef;

import java.util.Scanner;

public class CricketRaking {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int[] a = new int[3];
            int[] b = new int[3];
            for (int j = 0; j < a.length; j++) {
                a[j] = scanner.nextInt();
            }

            for (int j = 0; j < b.length; j++) {
                b[j] = scanner.nextInt();
            }

            if (a[0] > b[0] || a[1] > b[1] || a[2] > b[2]) {
                System.out.println("a");
            } else {
                System.out.println("b");
            }
        }

    }
}

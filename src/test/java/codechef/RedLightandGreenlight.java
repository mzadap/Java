package codechef;

import java.util.Scanner;

public class RedLightandGreenlight {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int count = 0;
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] h = new int[n];

            for (int j = 0; j < h.length; j++) {
                h[j] = scanner.nextInt();
            }

            for (int z = 0; z < h.length; z++) {
                if (h[z] > k) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

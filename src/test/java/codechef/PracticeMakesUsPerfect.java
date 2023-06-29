package codechef;

import java.util.Scanner;

public class PracticeMakesUsPerfect {

    public static void main(String[] args) {
        int[] test = new int[2];
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum = 0;
        int si = 0;
        int ti = 0;
        int winner = 0;
        int max = 0;


        for (int j = 0; j<N; j++) {
            si += scanner.nextInt();
            ti += scanner.nextInt();

            if (si > ti) {
                sum = si - ti;
                if (sum > max) {
                    max = sum;
                    winner = 1;
                }
                System.out.println(winner + " " + max);
            } else {
                sum = ti-si;
                if (sum > max) {
                    max = sum;
                    winner = 2;
                }
                System.out.println(winner + " " + sum);
            }

        }



       // System.out.println(count);
    }
}

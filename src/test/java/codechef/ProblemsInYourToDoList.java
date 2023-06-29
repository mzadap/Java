package codechef;

import java.util.Scanner;

public class ProblemsInYourToDoList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i<T; i++) {
            int count = 0;
            int N = scanner.nextInt();
            int[] D = new int[N];

            for (int k = 0; k<D.length; k++) {
                D[k] = scanner.nextInt();
            }

            for (int j = 0; j < D.length; j++) {
                if (D[j] >= 1000) {
                    count++;
                }
            }
            System.out.println(count);

        }

    }
}

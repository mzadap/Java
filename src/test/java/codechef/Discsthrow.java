package codechef;

import java.util.Scanner;

public class Discsthrow {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int A = 0;
        int B = 0;
        int C = 0;
        for (int i = 0; i < tc; i++) {
            A = sc.nextInt();
            B = sc.nextInt();
            C = sc.nextInt();

            if ((A >= B) && (A >= C)) {
                System.out.println(A);

            } else if ((B >= C) && (B >= A)) {
                System.out.println(B);

            } else if ((C>=A) && (C>=B)) {
                System.out.println(C);

            }
        }

    }
}

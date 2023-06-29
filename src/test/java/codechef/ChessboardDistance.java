package codechef;

import java.util.Scanner;

public class ChessboardDistance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i =0; i<T;i++) {
            int X1 = sc.nextInt();
            int Y1 = sc.nextInt();
            int X2 = sc.nextInt();
            int Y2 = sc.nextInt();

            int sum1 = X1 - X2;
            int sum2 = Y1 - Y2;
            System.out.println(Math.max(Math.abs(X1-X2), Math.abs(Y1-Y2)));
        }
    }
}

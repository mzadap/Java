package codechef;

import java.util.Scanner;

public class TheBlockGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0;i<t ;i++) {
            int n = sc.nextInt();
            int reverse = 0;
            int lastDigit = 0;
            int stored = n;
            while (stored !=0 ) {
                lastDigit = stored % 10;
                reverse = reverse * 10 + lastDigit;
                stored = stored / 10;

            }
            if(n == reverse) {
                System.out.println("wins");
                n = 0;
            } else {
                System.out.println("loses");
                n = 0;
            }
        }
    }
}

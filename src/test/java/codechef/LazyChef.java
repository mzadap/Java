package codechef;

import java.util.Scanner;

public class LazyChef {

    public static void main(String[] args) {
        /*int x = 2;
        int m = 2;
        int d = 3;
*/
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int x = scanner.nextInt();
            int m = scanner.nextInt();
            int d = scanner.nextInt();

            if ((x * m) > (x + d)) {
                System.out.println(x + d);
            } else {
                System.out.println(x * m);
            }
        }

    }
}

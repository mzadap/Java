package codechef;

import java.util.Scanner;

public class Cabservice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i<T; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            if (X < Y) {
                System.out.println("First");
            } else if (X == Y){
                System.out.println("Any");
            } else {
                System.out.println("Second");
            }
        }



    }
}

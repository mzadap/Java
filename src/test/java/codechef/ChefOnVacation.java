package codechef;

import java.util.Scanner;

public class ChefOnVacation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i< t; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            int Z = scanner.nextInt();
            int ab = X + Y;
            if (ab <= Z) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}

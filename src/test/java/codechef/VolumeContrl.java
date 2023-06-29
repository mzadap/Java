package codechef;

import java.util.Scanner;

public class VolumeContrl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        for (int i = 0; i<tc; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            if (Y>X) {
                System.out.println("Chef want to press " + (Y-X));
            } else {
                System.out.println("chef want to press " + (X-Y));
            }
        }
    }
}

package codechef;

import java.util.Scanner;

public class SpecialNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no");
        int tc = scanner.nextInt();
        for (int i = 0; i<tc; i++) {
            int no = scanner.nextInt();
            int a = no;
            int high = 0;
            while (a >0) {
                if (a > high) {
                    high = a;
                    System.out.println(high);
                }
            }
        }
    }
}


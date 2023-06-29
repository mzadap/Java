package codechef;

import java.util.Scanner;

public class EconomicsClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfTestCase = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < noOfTestCase; i++) {
            int noOfall = scanner.nextInt();
            int[] supply = new int[noOfall];
            int[] demand = new int[noOfall];

            for (int j = 0; j < supply.length; j++) {
                supply[j] = scanner.nextInt();
            }
            for (int j = 0; j < demand.length; j++) {
                demand[j] = scanner.nextInt();
            }

            for (int j = 0; j < supply.length; j++) {
                if (supply[j] == demand[j]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

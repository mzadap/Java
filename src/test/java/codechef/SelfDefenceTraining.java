package codechef;

import java.util.Scanner;

public class SelfDefenceTraining {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNumberOfTestCase = sc.nextInt();
        for (int i = 0; i < totalNumberOfTestCase; i++) {
            int numberOfWomen = sc.nextInt();
            int count = 0;
            for (int j = 0; j < numberOfWomen; j++) {
                int test = sc.nextInt();
                if (test >= 10 && test <= 60) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

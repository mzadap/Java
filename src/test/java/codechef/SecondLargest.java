package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i<T; i++) {
            int[] test = new int[3];
            for (int j = 0 ;j< test.length;j++) {
                test[j] = sc.nextInt();
            }
            Arrays.sort(test);
            System.out.println(test[1]);
        }



    }
}

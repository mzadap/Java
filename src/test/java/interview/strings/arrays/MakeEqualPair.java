package interview.strings.arrays;

import java.util.Scanner;

public class MakeEqualPair {

    public static void main(String[] args) {
        /*
        * Make equal number of pair with minimum number
        * */


        //int[] a = {2,2,1,1};
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i<t; i++) {
            int count = 0;
            int noOfTc = scanner.nextInt();
            int[] a = new int[noOfTc];
            scanner.nextInt();
            for (int k = 0; k<a.length; k++) {
                for (int j = 0; j<a.length; j++) {
                    if (a[k] != a[j]) {
                        a[j] = a[k];
                        count++;
                    }
                }
            }
            System.out.println(count);
        }


    }
}

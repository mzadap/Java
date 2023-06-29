package interview.strings.arrays;

import java.util.Arrays;

public class NewsArrays {

    public static void main(String[] args) {

        int[] a = {10, 3, 45, 40,1};
        int temp;
        for (int i = 0;i<=a.length-1; i++) {
            for (int j = 0; j<=a.length-1; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));

        for (int i = 0; i<=a.length-1; i++) {
            int temp1 = 0;
            if (a[i] == 1) {
                temp1 = 0;

            } else {
                for (int j = 2;  j<= a[i]-1; j++) {
                    if (a[i] % j == 0) {
                        temp1+=1;
                    }
                }
            }

            if (temp1 == 0) {
                System.out.println("it is prime " + a[i]);
            } else {
                System.out.println("it is not prime " + a[i]);
            }

        }
    }
}

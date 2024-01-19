package interview.strings.days100.codingbat.arrays;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        int[] a = {10, 3, 22, 33, 4};
        //reverse(a);
        System.out.println();
        System.out.println(Arrays.toString(ascendingOrder(a)));
    }

    static void reverse(int[] a) {
        for (int i = a.length-1; i>=0; i--) {
            System.out.print(a[i] + " ");
        }
    }

    static int[] ascendingOrder(int[] a) {
        int temp;
        for (int i =0; i<a.length; i++) {
            for (int j = 0; j<a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
}

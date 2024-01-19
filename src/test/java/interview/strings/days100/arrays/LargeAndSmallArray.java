package interview.strings.days100.arrays;

import java.util.Arrays;

public class LargeAndSmallArray {

    /*
     * 100 Days challenge, Day 20
     * Date - 20/09/2023
     *  Write a program in Java to find largest and smallest number in array.
     * */

    public static void main(String[] args) {
        int[] a = {20, 33, 45, 12, 23, 89, 1, 33};
        int temp;
        for (int i = 0; i<a.length; i++) {
            for (int j = i +1;j<a.length; j++ ) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(a[0]);
        System.out.println(a[a.length-1]);
        System.out.println(a[a.length-2]);
    }
}

package interview.strings.days100.arrays;

import java.util.Arrays;

public class LeftRotationBy2Position {

    /*
     * 100 Days challenge, Day 27
     * Date - 27/09/2023
     * Java program to perform left rotation of array elements by two positions.
     * */

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int d = 2;
        int k =0;
        int[] temp = new int[a.length];
        for (int i = d; i<a.length; i++) {
            temp[k] = a[i];
            k++;
        }

        for (int i =0; i<d; i++) {
            temp[k] = a[i];
            k++;
        }

        for (int i = 0; i<a.length; i++) {
            a[i] = temp[i];
        }

        System.out.println(Arrays.toString(a));
    }
}

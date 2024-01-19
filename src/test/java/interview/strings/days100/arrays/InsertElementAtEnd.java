package interview.strings.days100.arrays;

import java.util.Arrays;

public class InsertElementAtEnd {

    /*
     * 100 Days challenge, Day 21
     * Date - 21/09/2023
     * Java program to insert an element at end of an Array.
     * */

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 33, 1, 23};
        //a[a.length] = 50;
        a = Arrays.copyOf(a, a.length+1);
        a[a.length-1] = 55;
        System.out.println(Arrays.toString(a));
    }
}

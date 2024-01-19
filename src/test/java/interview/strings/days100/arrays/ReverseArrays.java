package interview.strings.days100.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArrays {

    /*
     * 100 Days challenge, Day 21
     * Date - 21/09/2023
     * Java program to print array in reverse Order.
     * */

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 33, 1, 23};
        int[] b = new int[a.length];
        List list = new ArrayList();
        for (int i = a.length-1; i>=0; i--) {
            b[i] = a[i];
            list.add(a[i]);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println(list);
    }

}

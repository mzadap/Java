package interview.strings.baiscs;

import java.util.Arrays;

public class SortArray {

    /*Date - 26/03/2024
    * Sort the array
    * */
    public static void main(String[] args) {
        int[] a = {10, 3, 22, 6, 12};
        for (int i =0; i<a.length; i++) {
            int temp = 0;
            for (int j = 0; j<a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));

    }
}

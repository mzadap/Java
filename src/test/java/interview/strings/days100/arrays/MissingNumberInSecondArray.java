package interview.strings.days100.arrays;

import java.util.Arrays;

public class MissingNumberInSecondArray {

    /*
     * 100 Days challenge, Day 19
     * Date - 19/09/2023
     *  Write a program in Java for, Given two arrays 1,2,3,4,5
     * and 2,3,1,0,5 find which number is not present in the second array.
     * */

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 3, 1, 0, 5};
        int i,j;
        Arrays.sort(b);
        for ( i = 0; i<a.length-1; i++) {
            for ( j = 0; j<b.length; j++) {
                if ((a[i]==b[i])) {
                    //System.out.println(b[i]);
                    break;
                }
            }
            if (i==j) {
                System.out.println(a[i]);
            }

        }
    }
}

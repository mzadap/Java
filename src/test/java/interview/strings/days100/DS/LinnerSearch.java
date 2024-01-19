package interview.strings.days100.DS;

import java.io.IOException;

public class LinnerSearch {

    /*
     * 100 Days challenge, Day 09
     * Date - 09/09/2023
     * 60. Linear Search in java Program
     * */

    public static void main(String[] args) {
        int[] a = {2, 4, 0, 1, 9};
        int k = 10;
        int j = linearSearch(a, k);
        if (j == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Element found " + j);
        }
    }
    static int linearSearch(int[] arr, int k) {
        int i;
        for ( i = 0; i< arr.length; i++) {
            if (arr[i]==k) {
                //System.out.println(i);
                return i;
            }
        }
        return -1;
    }
}

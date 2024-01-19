package interview.strings.days100.arrays;

public class MissingNumberInArrays {

    /*
     * 100 Days challenge, Day 18
     * Date - 18/09/2023
     *  Write a program in Java for, In array 1-100 numbers are stored, 
     * one number is missing how do you find it.
     * */

    public static void main(String[] args) {
        int[] a = {1,2,3,5};
        int sum = 0, diff;
        for (int i = 0; i<=a.length-2; i++) {
            diff = a[i+1] - a[i];
            if ( diff == 2) {
                sum = diff + i;
            }
        }
        System.out.println(sum);
    }
}

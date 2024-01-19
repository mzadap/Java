package interview.strings.days100.arrays;

public class FindAllPairsSumEquals {

    /*
     * 100 Days challenge, Day 18
     * Date - 18/09/2023
     *  Write a program in Java for, How to find all
     * pairs in array of integers whose sum is equal to given number.
     * */

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 7, 9, 10};
        int sum = 11;
        for (int i = 0; i<a.length-1; i++) {
            for (int j = i; j<a.length; j++) {
                if (a[i] + a[j] == sum) {
                    System.out.println(a[i] + " " + a[j]);
                }
            }
        }
    }
}

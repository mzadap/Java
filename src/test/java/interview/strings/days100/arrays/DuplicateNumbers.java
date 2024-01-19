package interview.strings.days100.arrays;

public class DuplicateNumbers {

    /*
     * 100 Days challenge, Day 19
     * Date - 19/09/2023
     *  Write a program in Java for, In a array 1-100 exactly one number is duplicate how do you find it.
     * */

    public static void main(String[] args) {
        int[] a = {10, 3, 4, 5, 10, 33, 4, 5};
        for (int i =0; i<a.length-1; i++) {
            for (int j = i+1; j<a.length; j++) {
                if (a[i]==a[j]) {
                    System.out.println("Duplicate numbers " + a[j]);
                }
            }
        }
    }
}

package interview.strings.days100.arrays;

public class EvenNumbers {

    /*
     * 100 Days challenge, Day 23
     * Date - 23/09/2023
     * Java Program to print all odd numbers in array.
     * */

    public static void main(String[] args) {

        int[] a = {10, 4, 5, 33, 22, 21};
        for (int i =0; i<a.length; i++) {
            if (a[i] % 2 == 0) {
                //System.out.println("Even numbers " + a[i]);
            } else {
                System.out.println("Odd numbers " + a[i]);
            }
        }
    }
}

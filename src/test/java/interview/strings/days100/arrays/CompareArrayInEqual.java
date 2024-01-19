package interview.strings.days100.arrays;

public class CompareArrayInEqual {

    /*
     * 100 Days challenge, Day 20
     * Date - 20/09/2023
     *  Write a program in Java for, How to compare two array is equal in size or not.
     * */

    public static void main(String[] args) {
        int[] a = {1,2,3,5};
        int[] b = {1,3,4,2};
        if (a.length==b.length) {
            System.out.println("Both array are equal size");
        } else {
            System.out.println("Both array are not equal in size");
        }

    }
}

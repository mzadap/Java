package interview.strings.days100.arrays;

public class SumOfArrayOfElemets {

    /*
     * 100 Days challenge, Day 23
     * Date - 23/09/2023
     * Java Program to find sum of array elements.
     * */
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 44};
        int sum = 0;
        for (int i =0; i<a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}

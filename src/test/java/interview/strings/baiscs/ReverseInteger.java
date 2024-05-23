package interview.strings.baiscs;

public class ReverseInteger {

    /*Date - 24-03-2024
    *  Reverse integer
    * */

    public static void main(String[] args) {
        int a = 23456;
        //o/p = 321
        int rem, rev = 0;
        while (a > 0) {
            rem = a % 10;
            rev = rev * 10 + rem;
            a = a/10;
        }
        System.out.println(rev);
    }
}

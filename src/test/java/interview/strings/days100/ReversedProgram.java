package interview.strings.days100;

public class ReversedProgram {

    /*
    20. Print Reverse number in java program
    * */

    public static void main(String[] args) {
        int a = 123, rem, rev = 0;
        while (a > 0) {
            rem = a % 10;
            rev = rev * 10 +rem;
            a /= 10;
        }
        System.out.println(rev);
    }
}

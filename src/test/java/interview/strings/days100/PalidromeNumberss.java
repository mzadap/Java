package interview.strings.days100;

public class PalidromeNumberss {

    /*
     * 100 Days challenge, Day 02
     * Date - 02/09/2023
     * 31. Check Given No is palindrome or Not in java
Program
     * */
    public static void main(String[] args) {
        System.out.println(palidrome(121));
    }

    public static boolean palidrome(int number) {
        int temp, rev = 0, rem;
        boolean result = false;
        temp = number;
        while (temp >0) {
            rem = temp % 10;
            rev = rev*10 + rem;
            temp /= 10;
        }

        if (number==rev) {
            result = true;
            //System.out.println("it is palidrome");
        } else {
            result = false;
            //System.out.println("it is not a palidrome");
        }
        return result;
    }
}

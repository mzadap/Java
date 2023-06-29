package interview.strings;

public class Palidrome {

    public static void main(String[] args) {
        System.out.println(isPalidrome(121));
    }

    public static boolean isPalidrome(int x) {
        int y = x;
        int rem = 0;
        int rev = 0;
        while (y != 0) {
            rev = y % 10;
            rem = rem * 10 + rev;
            y = y /10;
        }
        if (x == rem) {
            return true;
        } else {
            return false;
        }
    }
}

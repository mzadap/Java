package interview.strings.days100.codingbat;

public class LastDigit {

    public static void main(String[] args) {
        System.out.println(lastDigit(10, 22));
        System.out.println(lastDigit(17, 27));
    }

    public static boolean lastDigit(int a, int b) {
        int al = a % 10;
        int bl = b % 10;
        if (al == bl) {
            return true;
        }
        else {
            return false;
        }
    }
}

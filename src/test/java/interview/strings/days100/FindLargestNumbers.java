package interview.strings.days100;

public class FindLargestNumbers {

    public static void main(String[] args) {
        /*
        * Largest number
        * */
        int a = 190, b = 18, c = 3;
        if (!(a <= b || a <= c)) {
            System.out.println(a);
        } else if (b>a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}

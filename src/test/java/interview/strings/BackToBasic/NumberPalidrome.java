package interview.strings.BackToBasic;

public class NumberPalidrome {

    public static void main(String[] args) {
        int a = 424;
        int rev = 0, rem;
        int temp =a;
        while (a!=0) {
            rem = a % 10;
            rev = rev * 10 + rem;
            a = a/10;
        }
        System.out.println(rev);
        if (temp == rev) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

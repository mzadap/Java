package codechef;

public class RearrangingDigit {

    public static void main(String[] args) {

        int n = 103;
        int last = 0;
        int rev = 0;
        while (n > 0) {
            last = n%10;
            rev = rev * 10 + last;
            n = n / 10;

        }
        System.out.println(rev);
        if (rev % 5 == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

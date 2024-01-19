package interview.strings.starpattern;

public class RightTriangle_NotionTests {

    public static void main(String[] args) {
        for (int i = 0; i<=5; i++) {
            for (int j = 0; j<=i; j++) {
                    System.out.print("*");

            }
            System.out.println();
        }
        int a = 145;
        int temp = a;
        int rem = 0, rev = 0;
        while (temp > 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }
        System.out.println(rev);
    }
}

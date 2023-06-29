package interview.strings.basicprograms;

public class FibonacciSeries {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int sum = 1;
        for (int i = 1;i<=5; i++) {
            a = b;
            b = sum;
            sum = a + b;

            System.out.println(a);
        }
    }
}

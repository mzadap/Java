package interview.strings.basicprograms;

public class FibonacciSeries {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 2;i<400; i++) {
            sum = a + b;
            System.out.println(sum);
            a = b;
            b = sum;
        }
    }
}

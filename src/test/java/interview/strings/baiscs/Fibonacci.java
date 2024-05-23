package interview.strings.baiscs;

public class Fibonacci {

    /*
    * Date - 25/03/2024
    * Fibonacci series
    * */

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int sum;
        for (int i =0; i<=10; i++) {
            System.out.println(a);
            sum = a + b;
            a = b;
            b = sum;

        }
    }
}

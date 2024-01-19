package interview.strings.days100;

public class FactorialNumbers {

    public static void main(String[] args) {

        /*
        * Factorial of numbers
        * */
        int a = -10;
        if (a < 0) {
            System.out.println("Non negative numbers");
        } else {
            for (int i = a-1; i>=1; i--) {
                a *= i;
                //System.out.println(a);
            }
            System.out.println(a);
        }


    }
}

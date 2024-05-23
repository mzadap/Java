package interview.strings.days100.exceptionhandling.single;

public class Mains {

    public static void main(String[] args) {
       /* try {
            int[] a = {1,2,3};
            System.out.println(a[10]);
        }
        finally {
            System.out.println("hello");
        }*/
        checkAge(1);
    }

    static void checkAge(int age) throws ArithmeticException{
        if (age < 19) {
            System.out.println("hello");
        }
    }
}

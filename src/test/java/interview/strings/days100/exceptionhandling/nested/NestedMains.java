package interview.strings.days100.exceptionhandling.nested;

public class NestedMains {

    public static void main(String[] args) {
        try {

            try {
                int a = 10/0;
                try {
                    int[] b = new int[3];
                    System.out.println(b[10]);
                } catch (ArithmeticException e) {
                    System.out.println("this is a new");
                }
                System.out.println("going to divide by 0");

            } catch (ArithmeticException e ) {
                System.out.println(e);
            }

        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}

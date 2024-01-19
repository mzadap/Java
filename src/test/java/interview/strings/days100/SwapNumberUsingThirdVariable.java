package interview.strings.days100;

public class SwapNumberUsingThirdVariable {

    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        int c;
        /*c = a+b;
        a = c-a;
        b = c-b;*/
        c = a;
        a = b;
        b = c;
        System.out.println("a value is " + a + "\nvalue of b " + b);
    }
}

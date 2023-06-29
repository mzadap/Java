package codechef;

public class ReverseString {

    public static void main(String[] args) {
        String test = "Nachiket";
        //System.out.println(test.);
        char ab;
        String ab1 ="";
        for (int i = test.length() - 1; i>=0 ; i--) {
            ab = test.charAt(i);
            ab1 += ab;
        }
        System.out.println(ab1);
    }
}

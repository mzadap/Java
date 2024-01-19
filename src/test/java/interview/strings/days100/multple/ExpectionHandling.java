package interview.strings.days100.multple;

public class ExpectionHandling {

    /*
     * 100 Days challenge, Day 07
     * Date - 07/09/2023
     * 49. Exception Handling java Program
     * */

    public static void main(String[] args) {

        int a=10, b=0, sum;
        try{
            sum = a/b;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

}

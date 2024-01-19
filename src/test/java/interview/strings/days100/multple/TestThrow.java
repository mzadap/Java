package interview.strings.days100.multple;

public class TestThrow {

    /*
     * 100 Days challenge, Day 07
     * Date - 07/09/2023
     * 50. How to throw exception in java Program
     * */

    public static void main(String[] args) throws Exception {
        validate(66);
    }

    static void validate(int age) throws Exception {
        if (age<18) {
            throw new ArithmeticException("Not valid");
        } else if (age > 60) {
            throw new Exception("not valid age");
        } else {
            System.out.println("Eligble for vote");
        }
    }
}

package interview.strings.days100;

public class StaticBlock {
    /*
     * 100 Days challenge, Day 04
     * Date - 04/09/2023
     * 44. How Static block working in java Program
     * */

    public static void main(String[] args) {
        System.out.println("Main method");
    }

    static {
        // this block execute first
        System.out.println("Hello this is static block");
    }
}

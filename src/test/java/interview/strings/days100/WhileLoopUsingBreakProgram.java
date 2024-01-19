package interview.strings.days100;

public class WhileLoopUsingBreakProgram {

    /*
    * 21. While loop using break Program in java
     * */

    public static void main(String[] args) {
        int n = 10;
        while (true) {
            if (n != 0) {
                System.out.println("you entered" + n);
                continue;
            } else {
                break;
            }

        }
    }
}

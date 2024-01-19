package interview.strings.starpattern;

public class Pattern5 {

    public static void main(String[] args) {
        /*
         * https://www.javainterviewpoint.com/star-pattern-programs-in-java/
         * refer to pattern 5
         * */

        for (int i = 0; i<5; i++) {
            for (int j =0; j<9; j++) {
                if (j >= 4-i && j <= 4+i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

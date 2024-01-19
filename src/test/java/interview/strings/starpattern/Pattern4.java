package interview.strings.starpattern;

public class Pattern4 {

    public static void main(String[] args) {
        /*
        * https://www.javainterviewpoint.com/star-pattern-programs-in-java/
        * refer to pattern 4
        * */

        for (int i = 0; i<5; i++) {
            for (int j =0; j<5; j++) {
                if (j>=i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

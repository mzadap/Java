package interview.strings.starpattern;

public class Pattern9 {

    public static void main(String[] args) {
        /*
         * https://www.javainterviewpoint.com/star-pattern-programs-in-java/
         * pattern 8
         * */

        int k = 5;
        for (int i =0; i<=8; i++) {
            if (i>=5) {
                k++;
            } else {
                k--;
            }
            for (int j = 0;j<=4; j++) {
                if (j>=k ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

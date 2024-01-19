package interview.strings.starpattern;

public class Pattern6 {

    public static void main(String[] args) {
        /*
        * https://www.javainterviewpoint.com/star-pattern-programs-in-java/
        * pattern 6
        * */
        for (int i = 0; i<=3; i++) {
            for (int j =0; j<=6; j++) {
                if (j>=i && j<=6-i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

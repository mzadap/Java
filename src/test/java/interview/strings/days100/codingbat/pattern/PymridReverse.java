package interview.strings.days100.codingbat.pattern;

public class PymridReverse {

    /*
     * Day 03 of 100 days challenge part 2
     * Date - 05-01-2023
     * Program name - pyramid prgr
     * */


    public static void main(String[] args) {


        for (int i = 0; i<=3; i++) {
            for (int j = 0; j<=7; j++) {
                if (j >=i && j <= 6-i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

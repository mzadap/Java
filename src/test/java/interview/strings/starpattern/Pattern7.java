package interview.strings.starpattern;

public class Pattern7 {

    public static void main(String[] args) {
        int i, k =0;
        for ( i =0; i<9; i++) {
            //i<=4 ? k++: k--;
            if (i<=4) {
                k++;
            } else {
                k--;
            }
            for (int j =0; j<9; j++) {
                if (j>=5-k && j<=3+k ) {
                    System.out.print("*");
                } /*else if (j>=i && j<=4-i) {
                    System.out.print("*");
                }*/ else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

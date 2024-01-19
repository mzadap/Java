package interview.strings.days100;

public class MatrixMultiplication {

    /*
     * 100 Days challenge, Day 03
     * Date - 03/09/2023
     * 32. How to add two matrix in java Program
     * */

    public static void main(String[] args) {

        int[][] n = new int[2][2];
        int[][] m = new int[2][2];
        int[][] sum = new int[2][2];

        n[0][0] = 2;
        n[0][1] = 3;
        n[1][0] = 4;
        n[1][1] = 5;

        m[0][0] = 3;
        m[0][1] = 2;
        m[1][0] = 4;
        m[1][1] = 6;

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < m.length; j++) {
                sum[i][j] = n[i][j] * m[i][j];
            }
        }

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum.length; j++) {
                System.out.println(sum[i][j]);
            }
        }
    }
}

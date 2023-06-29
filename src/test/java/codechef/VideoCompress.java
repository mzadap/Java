package codechef;

import java.util.Scanner;

public class VideoCompress {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTestCase = sc.nextInt();
        for (int i = 0; i < noOfTestCase; i++) {
            int noOfIterations = sc.nextInt();
            int highValue = 0;
            for (int j = 0; j < noOfIterations; j++) {
                int[] valueOfIterations = new int[noOfIterations];
                if (valueOfIterations[noOfIterations] == valueOfIterations[noOfIterations + 1]) {
                    System.out.println(valueOfIterations[noOfIterations]);
                } else if (valueOfIterations[noOfIterations] > highValue){
                    highValue = valueOfIterations[noOfIterations];
                    System.out.println(highValue);
                }
            }
        }
    }
}

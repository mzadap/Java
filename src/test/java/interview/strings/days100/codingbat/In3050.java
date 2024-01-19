package interview.strings.days100.codingbat;

import java.util.Random;

public class In3050 {

    public static void main(String[] args) {
        //System.out.println(in3050(21, 44));
        //System.out.println(in3050(31, 44));

        Random random = new Random();

        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;

        // Print the random number
        System.out.println("Random Number: " + randomNumber);
    }

    static boolean in3050(int a, int b) {
        if ((a >= 30 && a<=50) && (b>=30 && b<=50)) {
            return true;
        } else {
            return false;
        }
    }
}

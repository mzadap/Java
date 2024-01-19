package interview.strings.days100;

import java.util.Random;

public class RandomNumber {

        /*
         * 100 Days challenge, Day 08
         * Date - 08/09/2023
         * 53. How to print date and time in java Program
         * */

        public static void main(String[] args) {
            int c;
            Random random = new Random();
            for (int i = 1; i<=10; i++) {
                System.out.println(random.nextInt(100));
            }
        }
}

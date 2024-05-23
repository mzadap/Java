package interview.strings.baiscs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Interview {

    public static void main(String[] args) {

            int[] ladder = { 7, 7, 8, 9, 6, 11, 9 };
            System.out.println(usageCount(ladder)); // Should print 5

    }
    public static int usageCount(int[] ladder) {
        //throw new UnsupportedOperationException("Waiting to be implemented.");
        int count = 0;
        for (int i =0; i< ladder.length-1; i++) {
            for (int j = i+1; j< ladder.length; j++) {
                if (ladder[i] > ladder[j]) {
                    count = i;
                    break;
                }
            }

        }
        return  count;
    }
}

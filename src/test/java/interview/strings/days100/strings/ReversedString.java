package interview.strings.days100.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class ReversedString {

    public static void main(String[] args) {
        int sum = 6;
        int[] a = {1, 2, 4, 5};
        for (int i =0; i<a.length; i++) {
            for (int j = i + 1; j<a.length; j++) {
                if (a[i] + a[j] == sum ) {
                    System.out.println(a[i] + "  " + a[j]);
                }
            }
        }

    }
}

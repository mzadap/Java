package interview.strings.days100.codingbat.arrays;

import java.util.*;

public class Duplicates {

    public static void main(String[] args) {
        //Input list : [150, 250, 300, 250, 500, 150, 600, 750, 300];
        int[] a = {150, 250, 300, 250, 500, 150, 600, 750, 300};

        int[] b = Arrays.stream(a).distinct().toArray();
        System.out.println(Arrays.toString(b));
        Set<Integer> integers = new HashSet<>();
        for (int i = 0; i<a.length; i++) {
            integers.add(a[i]);
        }
        System.out.println(integers);

    }
}

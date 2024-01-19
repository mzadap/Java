package interview.strings.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Interview {

    public static void main(String[] args) {
        //{0,2,1,1,0,2,0,1}
        int[] a = {0,2,1,3,1,4,0,2,5,0,0,1,1,2};
        int temp;
        for (int i =0; i<a.length; i++) {
            for (int j = i+1; j<a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }

        }
        System.out.println(Arrays.toString(a));


    }
}

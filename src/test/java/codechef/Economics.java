package codechef;

import java.util.Arrays;

public class Economics {

    public static void main(String[] args) {
        int[] s = {1, 1, 1, 4};
        int[] d = {1, 1, 1, 4};
        int count = 0;
        int[] test = new int[4];
       for (int i = 0;i< s.length; i++) {
        if (s[i] == d[i]) {
            count++;
        }
       }
        System.out.println(count);
        System.out.println(Arrays.toString(test));

    }
}

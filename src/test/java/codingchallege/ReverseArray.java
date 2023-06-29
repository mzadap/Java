package codingchallege;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arrs = {4, 5, 6};
        int[] testl = new int[3];
        for (int i = arrs.length-1; i >=0; i--) {
            System.out.print(Arrays.toString(arrs));
        }

        System.out.println(Arrays.toString(arrs));
    }
}

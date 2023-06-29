package interview.strings.BackToBasic;

import java.util.Arrays;

public class ForLoops {

    public static void main(String[] args) {
        int[] test = {1,3,4,5,6,7};
        //System.out.println(oddNumber(test).toString());
        int[] test1 = oddNumber(test);
        for (int i=0;i<test1.length;i++) {
            System.out.println(test1[i]);
        }
    }
    public static int[] oddNumber(int[] arr) {

        int[] arr1 = new int[arr.length];
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] % 2 != 0) {
               arr1[i] = arr[i];
            }
        }
        return arr1;
    }
}

package Test.CoreJava.arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arrys = {10,2,30,74,5,80};
        /*System.out.println("Not reverse array " + Arrays.toString(arrys));
        reverse(arrys);
        System.out.println("reverse array " + Arrays.toString(arrys));*/

        for (int i=arrys.length-1;i>=0;i--) {
            System.out.println(arrys[i]+ "");
        }
        System.out.println("reverse array " + Arrays.toString(arrys));
    }

    public static void reverse(int[] reverse) {
        int maxIndex = reverse.length-1;
        System.out.println("Max index of array is " + maxIndex);
        int halfLength = reverse.length/2;
        System.out.println("Half length is " + halfLength);

       for (int i=0; i<halfLength; i++) {
           int value = reverse[i];
           reverse[i] = reverse[maxIndex - i];
           reverse[maxIndex - i] = value;
       }
    }

}

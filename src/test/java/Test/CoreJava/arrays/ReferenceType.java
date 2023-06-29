package Test.CoreJava.arrays;

import java.util.Arrays;

public class ReferenceType {
    public static void main(String[] args) {

        int[] test = new int[5];
        int[] test2 = test;

        System.out.println("printing the first array " + Arrays.toString(test));
        System.out.println("printing the second array " + Arrays.toString(test2));

        for (int i=0;i<test.length;i++) {
            test[i] = i;
        }

        System.out.println("printing the first array " + Arrays.toString(test));
        System.out.println("printing the second array " + Arrays.toString(test2));

        test[0] = 10;

        System.out.println("printing the first array " + Arrays.toString(test));
        System.out.println("printing the second array " + Arrays.toString(test2));

        test2 = new int[] {70,80,90,77,88};
        modifyArray(test);

        System.out.println("printing after modify first array " + Arrays.toString(test));
        System.out.println("printing after modify the second array " + Arrays.toString(test2));
    }

    public static void modifyArray(int[] array) {
        array[3] = 10;
        array = new int[] {100,20,30,40,50};
    }
}

package Test.CoreJava.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ElementMinimun {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int readInts = readInteger();
        System.out.println("The elements are" + readInts);
        int[] readElems = readElements(readInts);
        System.out.println("New elements to be entered " + Arrays.toString(readElems));
        findMin(readElems);
    }

    public static int readInteger() {
        int count;
        count = scanner.nextInt();
        scanner.nextLine();
        return count;
    }

    public static int[] readElements(int readInteger) {
        int[] countRead = new int[readInteger];

        for (int i = 0; i<countRead.length; i++) {
            System.out.println("Enter the element");
            countRead[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return countRead;
    }

    public static int findMin(int[] test) {
        int minValue = test[0];
        for (int i=0;i<test.length;i++) {
            int value = test[i];
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }
}

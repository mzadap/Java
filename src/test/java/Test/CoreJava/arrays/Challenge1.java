package Test.CoreJava.arrays;

import java.util.Scanner;

public class Challenge1 {

    public static Scanner scanner = new Scanner(System.in);

    public int[] getInteger(int inputNumber) {
        System.out.println("Enter the number "+ inputNumber);
        int[] values = new int[inputNumber];

        for (int i=0; i<values.length;i++) {
            values[i] += scanner.nextInt();
        }
        return values;
    }

    public void printArray(int[] numbers) {
        for (int i =0; i<numbers.length;i++) {
            System.out.println("Element " + i + "contains " +numbers[i]);
        }
    }

    public int[] sortedArray(int[] unsortedArray) {
        int[] sortedArray = new int[unsortedArray.length];
        for (int i=0; i<sortedArray.length; i++) {
            sortedArray[i] = unsortedArray[i];

        }

        int temp;
        boolean flag = true;

        while (flag) {
            flag = false;
            for (int i=0;i<sortedArray.length;i++) {
                if (sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

}

package Test.CoreJava.arrays;

import java.util.Scanner;

public class Challanges {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] test = getInteger(5);
        int[] sort = sortedArry(test);
        printArray(sort);

    }
    public static void printArray(int[] array) {
        for (int i =0; i<array.length;i++){
            System.out.println("Arrays is " + array[i]);
        }
    }

    public static int[] getInteger(int numbers) {
        int[] values = new int[numbers];
        System.out.println("Enter the number");
        for (int i = 0 ; i< values.length; i++) {
            values[i] += scanner.nextInt();
        }
        return values;
    }

    public static int[] sortedArry(int[] array) {
        int[] sortedArray = new int[array.length];

        for (int i=0; i<array.length;i++) {
            sortedArray[i] = array[i];
        }

        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int i = 0 ; i<sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag =true;
                }
            }
        }
        return sortedArray;
    }
}

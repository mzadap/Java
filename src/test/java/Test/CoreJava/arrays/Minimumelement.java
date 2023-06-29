package Test.CoreJava.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Minimumelement {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("ENter count");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
        int returMin = findMin(returnedArray);
        System.out.println(returMin);

    }

    public static int[] readIntegers(int count) {
        int[] myCount = new int[count];
        for (int i=0; i<myCount.length;i++) {
            System.out.println("enter number");
            myCount[i] =  scanner.nextInt();
            scanner.nextLine();
        }
        /*int counts =0;
        for (int i=0; i<myCount.length;i++) {
            myCount[i] = counts;
        }
        System.out.println(counts);*/
        return myCount;
    }

    public static int findMin(int[] minValue) {
        //readIntegers(minValue);
       int min = minValue[0];
       for (int i=0; i<minValue.length;i++) {
           int value = minValue[i];
           if (value < min) {
               min = value;
           }

       }
       return min;
    }

}

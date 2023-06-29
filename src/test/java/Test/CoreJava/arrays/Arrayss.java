package Test.CoreJava.arrays;

import java.util.Scanner;

public class Arrayss {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int[] myTest = getNumbers(5);
        for (int i = 0; i<myTest.length; i++) {
            System.out.println("Element " + i + ", typed value was " +myTest[i] );
        }

        double test = getAverage(myTest);
        System.out.println("The averge is  " + test);
        }

    public static int[] getNumbers(int numbers) {
        System.out.println("Enter the " + numbers + " integer values. \r");
        int[] values = new int[numbers];
        for (int i = 0; i<values.length; i++) {
            values[i] += scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] arrys) {
        int sum = 0;
        for (int i = 0; i<arrys.length; i++) {
            sum += arrys[i];

        }
        return (double)sum/(double)arrys.length;
    }
}

package interview.strings.days100.arrays;

public class MinimumNumbersOfOperationsInArray {

    public static void main(String[] args) {
        int[] a = {0, 2, 3, 5, 4};
        int x = 1;
        int temp, operation = 0;
        for (int i =0 ;i<a.length; i++) {
            if (a[i] > x) {
                temp = a[i];
                a[i] = x;
                x = temp;
                operation++;
            }
        }
        System.out.println("Number of operation is " + operation);
    }
}

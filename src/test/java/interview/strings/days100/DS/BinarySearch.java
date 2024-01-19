package interview.strings.days100.DS;

public class BinarySearch {

    /*
     * 100 Days challenge, Day 10
     * Date - 10/09/2023
     * 60. BST in java Program
     * */

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 70};
        int high = arr.length-1;
        //System.out.println(high);
        int low = 0;
        int x = 60;
        int result = bs(arr, x, low, high);
        if (result == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Element found " + result);
        }
    }

    static int bs(int[] arry, int x, int low, int high) {
        int mid;
        while (low <= high) {
            mid = low + high /2;
            if (x == arry[mid]) {
                return mid;

            }
            if (x > arry[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}

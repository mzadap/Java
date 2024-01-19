package interview.strings.leetcode;

public class TwoSume {

    public static void main(String[] args) {
        int[] arr = {10, 22, 33, 44,2, 3};
        int target = 24;
        for (int i =0; i<arr.length; i++) {
            for (int j = 1; j<arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(i + " " + j);
                    break;
                }
            }

        }
    }
}

package interview.strings;

import java.util.Arrays;

public class SumOfTwoArrays {

    public static void main(String[] args) {
        int[] nums = {2,3,7,10,11};
        int target = 10;
        int nums1[] = new int[5];
        for (int i = 0; i<nums.length; i++) {
            for (int j = i + 1;j<nums.length;j++) {
                if (nums[i] + nums[j] == target) {
                  nums1 = Integer.toString(i).chars().map(c-> c-'0').toArray();
                    nums1 = Integer.toString(j).chars().map(c-> c-'0').toArray();
                    break;
                } else {
                    System.out.println("Not found");
                }
            }
        }
        System.out.println(Arrays.toString(nums1));

    }
}

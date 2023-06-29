package codechef;

import java.util.Arrays;

public class gcd {

    public static void main(String[] args) {
        int[] nums = {10, 5, 6, 9, 10};
        int count = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (count > nums[i]) {
                count = nums[i];
            }
        }
        System.out.println(count);
    }
}

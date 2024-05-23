package interview.strings.days100.arrays;

public class SameFirstLast {

    public static boolean sameFirstLast(int[] nums) {
        System.out.println();
        if(nums.length > 1) {
            if(nums[0]==nums[nums.length-1]) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /*static int[] pic() {
       // return int[0]
    }*/
    public static void main(String[] args) {
        int[] a = {1};
        System.out.println(sameFirstLast(a));
        //System.out.println(sameFirstLast([1,2,3]));
    }
}

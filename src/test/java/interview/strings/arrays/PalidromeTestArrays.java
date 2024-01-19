package interview.strings.arrays;

public class PalidromeTestArrays {

    public static void main(String[] args) {
        int[] test = {122, 344, 141, 333};
        int temp;
        int rem, rev = 0;
        for (int i =0; i<test.length; i++) {
            rev = 0;
            rem = 0;
            temp = test[i];
            int temp1 = temp;
            while (temp > 0) {
                rem = temp % 10;
                rev = rev * 10 + rem;
                temp /= 10;
            }
            if (temp1 == rev) {
                System.out.println("it is palidrome " + temp1);
            } else {
                System.out.println("It is not" + temp1);
            }
        }
    }
}

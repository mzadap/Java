package interview.strings.baiscs;

public class ArmstrongNumbers {

    /*Date - 24-03-2024
     *  Armstrong no
     * */


    public static void main(String[] args) {
        int n = 153;
        int rem, sum = 0, temp = n;
        while (temp > 0) {
            rem = temp % 10;
            sum += Math.pow(rem, 3);
            temp /= 10;
        }
        System.out.println(sum);
        if (n==sum) {
            System.out.println("it is armstrong no");
        } else {
            System.out.println(" it is not ");
        }
    }
}

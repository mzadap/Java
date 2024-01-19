package interview.strings.days100.codingbat.arrays;

public class Armstrong {

    public static void main(String[] args) {
        int a = 343;
        int n = a;
        int rem = 0, sum = 0;
        while (n>0) {
            rem = n % 10;
            sum += Math.pow(rem, 3);
            n /= 10;

        }

        System.out.println(sum);
        if (a == sum) {
            System.out.println("it is armstrong");
        } else {
            System.out.println("it is not ");
        }
    }
}

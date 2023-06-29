package testing;

public class sumofEvennumber {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(2468));
    }

    public static int getEvenDigitSum(int number) {

        if (number < 0) {

            return -1;
        }
        int sum = 0;
        int a = 0;
        int num = number;
        while (num > 0) {
            a = num % 10;
            if (a % 2 == 0) {
                sum += a;
            }
            num /= 10;
        }
        return sum;
    }
}

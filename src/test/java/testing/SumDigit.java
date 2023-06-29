package testing;

public class SumDigit {
    public static void main(String[] args) {
//        System.out.println(sumDigit(25));
//        System.out.println(sumDigit(2));
//        System.out.println(sumDigit(-25));
        System.out.println(sumDigit(5789));
    }

    public static int sumDigit(int number) {

        int sum = 0;
        int a=0;
        if (number < 10) {
            return -1;
        }
        while (number > 0) {
            a = number % 10 ;
            number /= 10;
        }
        return sum;
    }
}

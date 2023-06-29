package testing;

public class sumFirstAndLastDigit {
    public static void main(String[] args) {

        System.out.println(smFirstAndLastDigit(1238));
    }
    public static int smFirstAndLastDigit(int number) {
        int lastDigit = number % 10;
        int firstDigit = 0;
        int sum = 0;
        if (number < 0) {
            return -1;
        }

        while (number > 0 ) {
            firstDigit = number % 10;
            number = number / 10;

        }
        return sum = firstDigit + lastDigit;
    }
}

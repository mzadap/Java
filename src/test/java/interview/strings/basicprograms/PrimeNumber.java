package interview.strings.basicprograms;

public class PrimeNumber {

    public static void main(String[] args) {
        int no  = 19;
        int count = 0;
        for (int i = 2; i<no; i++) {
            if (no % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Prime number ");
        } else {
            System.out.println("It is not a prime number");
        }
    }
}

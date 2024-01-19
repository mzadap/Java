package interview.strings.days100;

public class PrimeNumbers {

    /*
    * Date - 31/08/2023
    * Print prime no Program in java
    * */

    public static void main(String[] args) {
        int n = 12;
        int count = 0;
        for (int i = 2; i<n;i++) {
            if (n %i == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("It is a prime number");
        } else {
            System.out.println("it is not prime number");
        }

    }
}

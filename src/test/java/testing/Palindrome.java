package testing;



public class    Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalimdrome(124));
    }

    public  static boolean isPalimdrome(int number) {

        int reverse = 0;
        int lastDigit = 0;
        int stored = number;
        while (stored !=0 ) {
            lastDigit = stored % 10;
            reverse = reverse * 10 + lastDigit;
            stored = stored / 10;

        }
        if (number == reverse){
            return true;
        }else {
            return false;
        }
    }
}

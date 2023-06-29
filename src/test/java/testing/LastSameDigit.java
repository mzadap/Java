package testing;

public class LastSameDigit {

    public static void main(String[] args) {
        //System.out.println(isValid(100));
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(-41, 22, 71));
        System.out.println(hasSameLastDigit(32, 22, 71));
        System.out.println(hasSameLastDigit(9, 99, 71));

    }

    public static boolean hasSameLastDigit(int a, int b, int c) {

        if (isValid(a) && isValid(b) && isValid(c)) {
            a %= 10;
            b %= 10;
            c %= 10;
            return (a==b) || (b==c) || (c==a);
        }else {
            return false;
        }
    }

    public static boolean isValid(int number) {

        if (number < 10 || number > 1000) {
            return false;
        }else {
            return true;
        }
    }
}

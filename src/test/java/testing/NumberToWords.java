package testing;

public class NumberToWords {
    public static void main(String[] args) {
        System.out.println(getDigitCount(0));
        System.out.println(reverse(-152));
        numberToWords(123);
        numberToWords(1011);

    }

    public static void numberToWords(int no) {
        int digit;
        if (no < 0) {
            System.out.println("Invalid value");;
        }

        int revno = reverse(no);
        for (int i = 0; i< getDigitCount(no); i++) {

            switch (revno % 10) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1 :
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("THree");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    break;
            }
            revno /=10;
        }
        System.out.println();
    }
    public static int reverse(int a) {
        int reverse = 0;
        int no;
        while (a > 0 || a < 0) {
            no = a % 10;
            a /=10;
            reverse = (reverse * 10) + no;
        }
        return reverse;

    }


    public static int getDigitCount(int no) {
        int a;
        int b;
        int sum = 0;
        if (no < 0) {
            return -1;
        }
        while (no > 0) {
           a= no%10;
           no/=10;
           sum++;
        }
        return sum;
    }


}

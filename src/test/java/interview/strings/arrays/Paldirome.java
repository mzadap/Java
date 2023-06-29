package interview.strings.arrays;

public class Paldirome {

    public static void main(String[] args) {

        int no = 121;
        int rem, rev = 0, temp;
        temp = no;
        while (temp > 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (no == temp) {
            System.out.println("it is palidrome");
        } else {
            System.out.println("it not ");
        }
        System.out.println(rev);
    }
}

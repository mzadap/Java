package interview.strings.days100;

public class ArmstrongNumbers {

    /*
    * 100 Days challenge, Day 01
    * Date - 01/09/2023
    * Check no is Armstrong or not in java
Program
    * */
    public static void main(String[] args) {
        int n = 112, temp, a = 0, sum;
        sum = n;
        while (sum >0) {
            temp = sum %10;
            a += Math.pow(temp, 3);
            sum /= 10;
        }
        if (n == a) {
            System.out.println("It is a armstrong number");
        } else {
            System.out.println("It is not a armstrong number");
        }


    }

}

package codechef;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        System.out.println("Enter amonut to withdraw");
        Scanner scanner = new Scanner(System.in);
        double no = scanner.nextDouble();
        double balance = scanner.nextDouble();
        //scanner.nextFloat()
        if (no % 5 == 0 && balance > no) {
            balance = balance - no;
            balance -= 0.50;
            System.out.println("Your current balance is " + balance);
        }
        else {
            System.out.println("Pls try again " + balance);
        }
    }
}

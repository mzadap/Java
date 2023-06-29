package Bootcamp.workbook;

import java.util.Scanner;

public class WorkBook5_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to javagram! sign in below");
        System.out.print("UserName: ");
        String userName = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        while (!(userName.equals("Nachiket") || password.equals("Test"))) {
            System.out.println("Incorrect, please try again");
            System.out.print("UserName: ");
            userName = scanner.nextLine();
            System.out.print("Password: ");
            password = scanner.nextLine();
        }
        System.out.println("sign in successful. Welcome!");
    }
}

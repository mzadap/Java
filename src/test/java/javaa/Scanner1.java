package javaa;

import java.util.Scanner;
public class Scanner1 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur age");
       String age = sc.nextLine();
        System.out.println(age);
        System.out.println("enter bill amount");
        sc.nextDouble();
    }
}

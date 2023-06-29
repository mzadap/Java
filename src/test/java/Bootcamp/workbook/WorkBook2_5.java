package Bootcamp.workbook;

import java.util.Scanner;

public class WorkBook2_5 {
    public static void main(String[] args) {

        String firstName;
        String lastName;
        String username;
        String city;
        String country;
        int age;

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your first name");
        firstName = sc.nextLine();
        System.out.println("What is your Last name");
        lastName = sc.nextLine();
        System.out.println("What would be username");
        username = sc.nextLine();
        System.out.println("What is ur city");
        city = sc.nextLine();
        System.out.println("what is ur country");
        country = sc.nextLine();
        System.out.println("What is ur age");
        age = sc.nextInt();
        System.out.println("\nHere the details you have enter" +
                "\nFirstname = " + firstName +
                "\nLastname = " + lastName +
                "\nage = " + age +
                "\nusername = " + username +
                "\ncity = " + city +
                "\ncountry = " + country);


    }
}

package testing;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENter your birth year ");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter your name");
            String name = scanner.nextLine();
            int ages = 2021 - age;
            if (ages >= 0 && ages <=100) {
                System.out.println("Your name is " + name + " and your age is " + ages);
            }else {
                System.out.println("Invalid birth year");
            }
        }
        else {
            System.out.println("Unbale to parse year of birth");
        }

    }
}

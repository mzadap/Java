package interview.strings.days100;

import java.util.Scanner;

public class UserInput_Scanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Input of int");
        int s = scanner.nextInt();
        System.out.println("Output values integer" + s);
        System.out.println("ENter input for strings ");
        String s1 = scanner.next();
        System.out.println("Output for strings " + s1);
        System.out.println("Enter input for floats");
        float s2 = scanner.nextFloat();
        System.out.println("output for float " + s2);
    }
}

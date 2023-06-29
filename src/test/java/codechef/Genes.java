package codechef;

import java.util.Scanner;

public class Genes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String eyeColor1 = sc.next();
        String eyeColor2 = sc.next();
        if (eyeColor1.equals("R") && eyeColor2.equals("R")) {
            System.out.println("R");
        } else if (eyeColor1.equals("R") && eyeColor2.equals("G")) {
            System.out.println("R");
        } else if (eyeColor1.equals("R") && eyeColor2.equals("B")) {
            System.out.println("R");
        } else if (eyeColor1.equals("B") && eyeColor2.equals("G")) {
            System.out.println("B");
        } else if (eyeColor1.equals("B") && eyeColor2.equals("B")) {
            System.out.println("B");
        } else if (eyeColor1.equals("G") && eyeColor2.equals("G")) {
            System.out.println("G");
        } else if (eyeColor1.equals("G") && eyeColor2.equals("B")) {
            System.out.println("B");
        }
    }
}

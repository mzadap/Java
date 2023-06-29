package Bootcamp.workbook;

import java.util.Scanner;

public class Workbook3_7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("\n***Royal Bank of india***");
        System.out.println("Are you here to get a mortage? (Yes or NO)");
        String decision = scan.nextLine();
        if (decision.equals("Yes")) {
            System.out.println("\n Great! In one line " + "\nHow much money do you have in your savings? " + "\nAnd, how much do you owe in credit card debt?");
            int savings = scan.nextInt();
            int creditCards = scan.nextInt();
            scan.nextLine();
            System.out.println("How many years you worked for?");
            int workExperice = scan.nextInt();
            scan.nextLine();
            System.out.println("What is your name?");
            String name = scan.nextLine();
            if (savings>=10000 && creditCards<=5000 && workExperice>=2) {
                System.out.println("Congratulations " + name + " , you have been approved!");
                System.out.println("\nSavings: " + savings + "\ndebt: " + creditCards + "\nyears: " + workExperice);
            } else {
                System.out.println("Sorry, you are not eligible for a mortgage.");
            }
        } else {
            System.out.println("Ok, Have a nice day");
        }
    }
}

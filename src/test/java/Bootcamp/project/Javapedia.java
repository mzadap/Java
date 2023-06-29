package Bootcamp.project;

import java.util.Scanner;

public class Javapedia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many historical figures will you register?");
        int valuesOfHistorical = scan.nextInt();

        String[][] database = new String[valuesOfHistorical][3];
        scan.nextLine();
        for (int i = 0; i< database.length; i++) {
            System.out.println("Figure " + (i+1));
            System.out.print("\t . Name: ");
            database[i][0] = scan.nextLine();
            System.out.print("\t . Date of birth: ");
            database[i][1] = scan.nextLine();
            System.out.print("\t . Occupation: ");
            database[i][2] = scan.nextLine();
        }
        System.out.println("These are the values stored");
        print2DArray(database);
        System.out.print("Who do you want information on?");
        String name = scan.nextLine();
        for (int i = 0; i<database.length; i++) {
            if (database[i][0].equals(name)) {
                System.out.println("\tname " + database[i][0]);
                System.out.println("\tDate of birth: " + database[i][1]);
                System.out.println("\tOccupation: " + database[i][2]);

            }
        }
    }

    public static void print2DArray(String[][] database) {
        for (int i = 0; i<database.length; i++) {
            for (int j = 0; j<database[i].length; j++) {
                System.out.print("\t" +database[i][j] + " ");
            }
            System.out.println("");
        }
    }

}

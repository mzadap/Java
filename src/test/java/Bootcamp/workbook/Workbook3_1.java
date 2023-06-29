package Bootcamp.workbook;

public class Workbook3_1 {
    public static void main(String[] args) {

        double change = 3.50;
        double price = 2.50;
        System.out.println("\nHi java, Do i have enough money to buy chips?");
        System.out.println("Java " + (change > price));

        int people = 15;
        int capcityOfEvalotor = 12;
        System.out.println("\nHi java, can the elevator hold everyone? ");
        System.out.println("Java " + (capcityOfEvalotor > people));

        String request = "PS5";
        String purchase = "Toy car";
        System.out.println("\nHi java, will my friend be happy?");
        System.out.println("Java " + (request.equals(purchase)));

        int space = 10;
        int guest = 8;
        System.out.println("\nHi java, can everyone will attend dinner party");
        System.out.println("Java " + (space > guest));

        int vote = 15;
        int competitor = 12;
        System.out.println("\nHi java, will i win the election");
        System.out.println("Java " + (vote > competitor));



    }
}

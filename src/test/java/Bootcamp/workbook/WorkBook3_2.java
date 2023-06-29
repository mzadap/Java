package Bootcamp.workbook;

public class WorkBook3_2 {

    public static void main(String[] args) {

        double wallet = 100;
        double toyCar = 5.99;

        System.out.println("\ncan i buy this car??");
        if (wallet > toyCar) {
            System.out.println("Sure!!");
            wallet -= toyCar;
            System.out.println("Wallet balance " + wallet);
        }
        else {
            System.out.println("sorry I only have " + wallet + " left");
        }

        double nike = 95.99;
        System.out.println("\ncan i buy this shoes??");
        if (wallet > 95.99) {
            System.out.println("sure");
        }else {
            System.out.println("sorry I only have " + wallet + " left");
        }
    }
}

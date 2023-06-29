package Bootcamp.workbook;

public class WorkBook2_3 {

    public static void main(String[] args) {
        int numOfApples = 0;
        int numOfCustomers = 0;
        double profit = 0;

        System.out.println("You picked "+ (numOfApples + 500)  +" apples from an apple orchard");
        numOfApples += 500;
        profit += 89.6;
        numOfCustomers += 3;
        //numOfCustomers -= 224;

        System.out.println("You picked " + numOfApples + " from an apple orchard");
        System.out.println("Wow! So far, you made: $ " + profit);
        System.out.println( numOfCustomers + " customers love your apples.");
        numOfCustomers += 221;
        System.out.println(" you have " + numOfCustomers + " apples left. We'll sell more tomorrow!" );
    }
}

package Bootcamp.project.vendingmachine;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Item item = new Item("coke", 10, 1);
        //System.out.println(item);
        Item[][] items = new Item[][] {
                { new Item("Pepsi", 19, 3) , new Item("Fresca", 149, 3), new Item("Brisk", 249, 2) },
                { new Item("Fanta", 199, 2) , new Item("Barq's", 19, 2), new Item("A & W", 29, 3) },
                { new Item("Crush", 1, 2) , new Item("C-Cola", 19, 2), new Item("Berry", 29, 1) }
        };

            Machine machine = new Machine(items);
            Item item1 = machine.getItem(0, 1);
            item1.setName("Maza");
            item1.setPrice(500);
            item1.setQuantity(10);
            machine.setItem(item1, 0, 1);
        System.out.println(machine);

     /*   System.out.println(machine);
        machine.dispense(0, 0);
        machine.dispense(0, 0);*/

       /* Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("pick a row");
            int row = scanner.nextInt();

            System.out.println("prick a spot in the row");
            int spot = scanner.nextInt();
            boolean test = machine.dispense(row, spot);
            System.out.println("\n" + machine);

            if (test == true) {
                System.out.println("\n Enjoy your drink! Press 1 to purchase another ");
            } else {
                System.out.println("\n sorry, we re out of this item. press 1 to purchase another drink");
            }

            if (scanner.nextInt() != 1) {
                break;
            }

        }
*/


        //System.out.println(machine);
        //System.out.println(machine.getItem(0, 0));
    }
}

package Test.CoreJava.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstruction();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printGrocery();
                    break;
                case 2:
                    addItems();
                    break;
                case 3:
                    modifyItems();
                    break;
                case 4:
                    removeItems();
                    break;
                case 5:
                    findItems();
                    break;
                case 6:
                    processedArrayList();
                    break;
                case 7:
                    quit =true;
                    break;
            }
        }
    }

    public static void printInstruction() {
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add an items to the list");
        System.out.println("\t 3 - To modify the items in the list");
        System.out.println("\t 4 - To remove the items in the list");
        System.out.println("\t 5 - To search for item in the list");
        System.out.println("\t 6 - To quit the application");
    }

    public static void addItems() {
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryList(scanner.nextLine());
    }

    public static void modifyItems() {
        System.out.print("enter item number");
        String  itemNo = scanner.nextLine();
        System.out.print("Enter replacement item ");
        String newItem = scanner.nextLine();
        groceryList.modifyItems(itemNo, newItem);
    }

    public static void removeItems() {
        System.out.print("Enter the position be removed");
        String position = scanner.nextLine();
        groceryList.removeGrocery(position);
    }

    public static void findItems() {
        System.out.print("Enter the item to be search");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + "in our grocery list");
        } else {
            System.out.println(searchItem + " is not found in the shoping list");
        }
    }

    public static void processedArrayList() {
        ArrayList<String> strings = new ArrayList<>();
        strings.addAll(groceryList.getGroceryList());

        ArrayList<String> myArrays = new ArrayList<>(groceryList.getGroceryList());
        System.out.println(myArrays);

        String[] testArrays = new String[groceryList.getGroceryList().size()];
        testArrays = groceryList.getGroceryList().toArray(testArrays);
    }
}

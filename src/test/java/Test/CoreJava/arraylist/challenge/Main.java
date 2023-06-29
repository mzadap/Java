package Test.CoreJava.arraylist.challenge;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static MobilePhone mobilePhone = new MobilePhone();
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstruction();
        while (!quit) {
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                        quit = true;
                        break;

            }
        }


    }


    public static void addNewContact() {
        System.out.println("Enter new contact name ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number");
        String phoneNumber = scanner.nextLine();
        Contacts contacts = new Contacts(name, phoneNumber);

        if (mobilePhone.addContact(contacts)) {
            System.out.println("New contact added: " + name + " phone " + phoneNumber);
        }else {
            System.out.println("Cannot add, " + name + "already exists");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name ");
        String name = scanner.nextLine();
        Contacts exisitingContactRecord = mobilePhone.queryContact(name);
        if (exisitingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Enter new contact name ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number ");
        String newNumber = scanner.nextLine();
        Contacts newContact = new Contacts(newName, newNumber);
        if (mobilePhone.updateContact(exisitingContactRecord, newContact)) {
            System.out.println("Successfully updated record");
        }else {
            System.out.println("Error updating record");
        }

    }

    private static void removeContact() {
        System.out.println("Enter existing contact name ");
        String name = scanner.nextLine();
        Contacts exisitingContactRecord = mobilePhone.queryContact(name);
        if (exisitingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        if (mobilePhone.removeContacts(exisitingContactRecord)) {
            System.out.println("Successfully deleted");
        }else {
            System.out.println("Error deleting contact");
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name ");
        String name = scanner.nextLine();
        Contacts exisitingContactRecord = mobilePhone.queryContact(name);
        if (exisitingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        if (mobilePhone.removeContacts(exisitingContactRecord)) {
            System.out.println("Successfully deleted");
        }else {
            System.out.println("Error deleting contact");
        }
    }

        public static void printInstruction() {
        System.out.println("\n Press");
        System.out.println("\t 0 - Print options ");
        System.out.println("\t 1 - Print Contacts list");
        System.out.println("\t 2 - Add new contact");
        System.out.println("\t 3 - Update new contacts");
        System.out.println("\t 4 - remove the new contacts");
        System.out.println("\t 5 - search the contacts");
        System.out.println("\t 6 - quit");
    }

}

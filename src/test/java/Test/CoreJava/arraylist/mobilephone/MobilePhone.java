package Test.CoreJava.arraylist.mobilephone;

import Test.CoreJava.ComplexNumber;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private static ArrayList<Contact> contacts = new ArrayList<Contact>();

    public MobilePhone(String myNumber, ArrayList<Contact> contacts) {
        this.myNumber = myNumber;
        this.contacts = contacts;
    }

    public int findContact(Contact contact) {
        return contacts.contains(contact) ? contacts.indexOf(contact) :-1;
    }

    public static int findContact(String name) {
        for (Contact contact: contacts) {
            if (contact.getName().equals(name)) {
                return contacts.indexOf(contact);
            }
        }
        return -1;
    }

    public  boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) < 0) {
            contacts.add(contact);
            return true;
        }else {
            return false;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact);
        if (position < 0) {
            System.out.println("No contact found");
            return false;
        }else {
            contacts.set(position, newContact);
            System.out.println(newContact.getName() + " updated successfully");
            return true;
        }
    }

    public boolean removeContact(Contact contact) {
        int position = findContact(contact);
        if (position <0){
            System.out.println(contact.getName() + " does not exist");
            return false;
        }else {
            System.out.println(contact.getName() + " removed from the contact list");
            contacts.remove(position);
            return true;
        }
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        return (position <0 ? null : contacts.get(position));
    }

    public void printContacts() {
        System.out.println("Contact list");
        for (Contact contact: contacts) {
            System.out.println((contacts.indexOf(contact)+1) + " . " + contact.getName() + "->");
        }
    }
}

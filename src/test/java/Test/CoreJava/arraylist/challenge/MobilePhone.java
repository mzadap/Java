package Test.CoreJava.arraylist.challenge;

import java.util.ArrayList;

public class MobilePhone {
    //Contacts contacts = new Contacts();

    public static ArrayList<Contacts> contactsArrayList = new ArrayList<>();

    public static void printContactList() {
        System.out.println("you have " + contactsArrayList.size() + " with contacts");
        for (int i = 0;i<contactsArrayList.size();i++) {
            System.out.println((i+1) + ". " + contactsArrayList.get(i).getName() + " : " + contactsArrayList.get(i).getPhone());
        }
        System.out.print("");

    }


    public  boolean addContact(Contacts contacts){
        if (findContacts(contacts.getName()) >=0) {
            System.out.println("Contact is already on file");
            return false;
        }
        contactsArrayList.add(contacts);
        return true;
    }

    public boolean updateContact(Contacts oldContact, Contacts newContact) {
        int foundPosition = findContacts(oldContact);
        if (foundPosition <0) {
            System.out.println(oldContact.getName() + " , was not found.");
            return false;
        }

       this.contactsArrayList.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced to " + newContact.getName());
        return true;
    }

    public boolean  removeContacts(Contacts contactNumber) {
        int foundPosition = findContacts(contactNumber);
        if (foundPosition <0) {
            System.out.println(contactNumber.getName() + " , was not found.");
            return false;
        }
        this.contactsArrayList.remove(foundPosition);
        System.out.println(contactNumber.getName()+ ", was deleted");
        return true;
    }

    private int findContacts(Contacts contacts) {
        return this.contactsArrayList.indexOf(contacts);
    }

    private int findContacts(String contactName) {
        for (int i=0;i<this.contactsArrayList.size();i++) {
            Contacts contacts = this.contactsArrayList.get(i);
            if (contacts.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public void printContacts() {
        System.out.println("Contact lists");
        for (int i=0;i<this.contactsArrayList.size();i++) {
            System.out.println((i+1) + "." + this.contactsArrayList.get(i).getName() + " -> " +this.contactsArrayList.get(i).getPhone());
        }
    }

    public String queryContact(Contacts contacts) {
        if (findContacts(contacts) >=0) {
            return contacts.getName();
        }
        return null;
    }

    public Contacts queryContact(String name) {
        int position = findContacts(name);
        if (position >=0) {
            return this.contactsArrayList.get(position);
        }
        return null;
    }
}

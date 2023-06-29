package Test.CoreJava.arraylist;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryList(String items) {
        groceryList.add(items);
    }

    public void printGrocery() {
        System.out.println("you have " +groceryList.size() + " items in your grocery list");
        for (int i=0;i<groceryList.size();i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyItems(String currentItem,String newItems) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyItems(position, newItems);
        }
    }

    private void modifyItems(int position, String newItems) {
        groceryList.set(position, newItems);
        System.out.println("Grocery items " + (position+1) + " has been modified");
    }

    public void removeGrocery(String items) {
        int position = findItem(items);
        if (position >=0) {
            removeGrocery(position);
        }
    }

    private void removeGrocery(int position) {
        groceryList.remove(position);
    }

    private int findItem(String searchItems) {
        return groceryList.indexOf(searchItems);
    }

    public boolean onFile(String searchItems) {
        int position = findItem(searchItems);
        if (position >=0) {
            return true;
        }
        return false;
    }
}

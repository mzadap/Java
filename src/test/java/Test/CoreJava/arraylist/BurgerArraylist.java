package Test.CoreJava.arraylist;

import java.util.ArrayList;

public class BurgerArraylist {

    private ArrayList<String> burgerName = new ArrayList<>();

    public void addBurger(String burgerName) {
       // burgerName.add(burgerName);
    }

    public int findPositionOfBurger(String position) {
        return (burgerName.indexOf(position));
    }

    public void updateBurger(String currentburgerName, String newBurgerName) {
        int position = findPositionOfBurger(currentburgerName);
        if (position<0) {
            System.out.println("Could not update the burger name");
        }

        burgerName.set(position, newBurgerName);
        System.out.println(currentburgerName + " is replaced with new name " + newBurgerName);
    }

    public void removeBurgerName(String burgerName) {
        int position = findPositionOfBurger(burgerName);
      //  burgerName.remove(position);
    }
}

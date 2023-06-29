package Test.CoreJava.OOPS;

public class Main {
    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("white", "Chicker", 20, "Basic");
        double price = hamburger.itemAdded();
        hamburger.addHamburgerAddition1("Tomato" , 10);
        hamburger.addHamburgerAddition2("chesse", 20);
        hamburger.addHamburgerAddition3("test", 5);
        System.out.println(hamburger.itemAdded());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 50);
        healthyBurger.addAdditionHealty1("egg", 10);
        System.out.println("total healty burger price is " + healthyBurger.itemAdded());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemAdded();
    }
}

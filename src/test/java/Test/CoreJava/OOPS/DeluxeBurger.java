package Test.CoreJava.OOPS;

public class DeluxeBurger extends Hamburger{

    private String chips;
    private String drinks;

    public DeluxeBurger() {
        super("White", "chicken", 40, "Deluxe");
        super.addHamburgerAddition1("Chips", 40);
        super.addHamburgerAddition2("drinks" , 40);
    }

    @Override
    public void addHamburgerAddition1(String name, double addition1Price) {
        System.out.println("cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double addition2Price) {
        System.out.println("cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double addition3Price) {
        System.out.println("cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double addition4Price) {
        System.out.println("cannot add additional items to a deluxe burger");
    }
}

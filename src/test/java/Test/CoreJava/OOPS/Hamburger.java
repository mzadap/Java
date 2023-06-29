package Test.CoreJava.OOPS;

public class Hamburger {

    private String breadType;
    private String meat;
    private int price;
    private String burgerName;
    private String varieties;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String breadType, String meat, int price, String burgerName) {
        this.breadType = breadType;
        this.meat = meat;
        this.price = price;
        this.burgerName = burgerName;
    }

    public void addHamburgerAddition1(String name, double addition1Price) {
        this.addition1Name = name;
        this.addition1Price = addition1Price;
    }

    public void addHamburgerAddition2(String name, double addition2Price) {
        this.addition2Name = name;
        this.addition2Price = addition2Price;
    }

    public void addHamburgerAddition3(String name, double addition3Price) {
        this.addition3Name = name;
        this.addition3Price = addition3Price;
    }

    public void addHamburgerAddition4(String name, double addition4Price) {
        this.addition4Name = name;
        this.addition4Price = addition4Price;
    }

    public double itemAdded() {
        double hamburgerPrice = this.price;
        System.out.println(this.burgerName + " hamburger " + " on a " + this.breadType + " roll"
                        + "price is " + this.price);
        if(this.addition1Name != null) {
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
        }
        if(this.addition2Name != null) {
            hamburgerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
        }
        if(this.addition3Name != null) {
            hamburgerPrice += this.addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
        }
        if(this.addition4Name != null) {
            hamburgerPrice += this.addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
        }
        return hamburgerPrice;
    }

    public void setPrice() {

    }
    public String getBreadType() {
        return breadType;
    }

    public String getMeat() {
        return meat;
    }

    public int getPrice() {
        return price;
    }

}

package Test.CoreJava.billburger;

public class Hamburger {

    private double price;
    private String name;
    private String meat;
    private String breadRoll;

    private double addition1Price;
    private String addition1Name;

    private double addition2Price;
    private String addition2Name;

    private double addition3Price;
    private String addition3Name;

    private double addition4Price;
    private String addition4Name;

    public Hamburger(double price, String name, String meat, String breadRoll) {
        this.price = price;
        this.name = name;
        this.meat = meat;
        this.breadRoll = breadRoll;
    }

    public void addAddition1(String addition1Name, double addition1Price) {
        this.addition1Price = addition1Price;
        this.addition1Name = addition1Name;
    }

    public void addAddition2(String addition2Name, double addition2Price) {
        this.addition2Price = addition2Price;
        this.addition2Name = addition2Name;
    }

    public void addAddition3(String addition3Name, double addition3Price) {
        this.addition3Price = addition3Price;
        this.addition3Name = addition3Name;
    }

    public void addAddition4(String addition4Name, double addition4Price) {
        this.addition4Price = addition4Price;
        this.addition4Name = addition4Name;
    }

    public double itemizehamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + " on a " + this.breadRoll + " roll"
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
}

package Test.CoreJava.composition.challenge;

public class Room {

    private Furniture furniture;
    private int swithces;
    private Builtup builtup;

    public Room(Furniture furniture, int swithces, Builtup builtup) {
        this.furniture = furniture;
        this.swithces = swithces;
        this.builtup = builtup;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public int getSwithces() {
        return swithces;
    }

    public Builtup getBuiltup() {
        return builtup;
    }
}

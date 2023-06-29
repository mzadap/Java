package Test.CoreJava.composition.test;

public class Main {

    public static void main(String[] args) {
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12,25);

        Bed bed = new Bed("Modern","two", 4, 2, 2);
        Lamp lamp = new Lamp("New", false,4);

        Bedroom bedroom = new Bedroom("Nachikets", wall1, wall2, wall3, wall4,ceiling,bed,lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();

    }
}


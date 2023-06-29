package Test.CoreJava.composition.challenge;

public class Main {

    public static void main(String[] args) {
        Builtup builtup = new Builtup(1,2,6);
        Furniture furniture = new Furniture(2,2,2,1,2);
        Room room = new Room(furniture, 6, builtup);
        NEWONOFF newonoff = new NEWONOFF("on", "off");
        newonoff.fanon(1);
        room.getFurniture().speedOfFan();
        room.getFurniture().numberoftalbe(1);
    }
}

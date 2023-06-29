package Test.CoreJava.composition.challenge;

public class Furniture {

    private int bed;
    private int wardrobe;
    private int table;
    private int fan;
    private int tubeLight;
    public NEWONOFF newonoff;

    public Furniture(int bed, int wardrobe, int table, int fan, int tubeLight) {
        this.bed = bed;
        this.wardrobe = wardrobe;
        this.table = table;
        this.fan = fan;
        this.tubeLight = tubeLight;
    }

    public void speedOfFan() {
        newonoff.fanon(1);
        System.out.println("The speed of fan  ");
    }

    public void numberoftalbe(int numberoftables) {
        System.out.println("The number of table present in a room " + numberoftables);
    }

    public int getBed() {
        return bed;
    }

    public int getWardrobe() {
        return wardrobe;
    }

    public int getTable() {
        return table;
    }

    public int getFan() {
        return fan;
    }

    public int getTubeLight() {
        return tubeLight;
    }
}

package Test.CoreJava.composition.challenge;

public class Builtup {

    private int doors;
    private int windows;
    private int walls;

    public Builtup(int doors, int windows, int walls) {
        this.doors = doors;
        this.windows = windows;
        this.walls = walls;
    }

    public int getDoors() {
        return doors;
    }

    public int getWindows() {
        return windows;
    }

    public int getWalls() {
        return walls;
    }
}

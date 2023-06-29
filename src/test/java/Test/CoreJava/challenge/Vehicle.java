package Test.CoreJava.challenge;

public class Vehicle {
    private String Name;
    private String size;

    private int curretVelocity;
    private int currentDirection;

    public Vehicle(String Name, String size) {
        this.Name = Name;
        this.size = size;
        this.currentDirection = 0;
        this.curretVelocity = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("vehicle.steer(): steering at" + currentDirection + "degrees");
    }

    public void move(int velocity, int direction ) {
        currentDirection = direction;
        curretVelocity = velocity;
        System.out.println("vehicle.move() moving at " + curretVelocity + "in direction " + currentDirection);
    }

    public String getName() {
        return Name;
    }

    public String getSize() {
        return size;
    }

    public int getCurretVelocity() {
        return curretVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop() {
        this.curretVelocity = 0;
    }
}

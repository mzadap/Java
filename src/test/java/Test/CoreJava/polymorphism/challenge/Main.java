package Test.CoreJava.polymorphism.challenge;

import Test.CoreJava.challenge.car;

class Car{
    private boolean engine;
    private int wheel;
    private int cylinders;
    private String carName;

    public Car(int wheel, int cylinders, String carName) {
        this.wheel = wheel;
        this.cylinders = cylinders;
        this.engine = true;
        this.carName = carName;
    }

    public String startEngine() {
       return "The car engine is started";
    }

    public String  accelerate() {

        return "The car is being accelerate";
    }

    public String  brake() {
        return "The car is applied brake";
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheel() {
        return wheel;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getCarName() {
        return carName;
    }
}

class Safari extends Car {


    public Safari() {
        super(4, 4, "Safari");
    }

    @Override
    public String  startEngine() {
       return ("the " + getCarName() + " engine is started with cylinder " + getCylinders());
    }

    @Override
    public String brake() {
        return ("The brake for " + getCarName() + " is applied");
    }
}

class Innova extends Car {

    public Innova() {
        super(4, 5, "Innova");
    }

    @Override
    public String startEngine() {
        return ("the " + getCarName() + " engine is started with cylinder " + getCylinders());
    }

    @Override
    public String accelerate() {
        return ("the accelerate for " + getCarName() + " is applied");
    }

    @Override
    public String brake() {
        return ("The brake for " + getCarName() + " is applied");
    }
}

class xuv extends Car {

    public xuv() {
        super(4, 4, "xuv700");
    }

    @Override
    public String startEngine() {
        return ("the " + getCarName() + " engine is started with cylinder " + getCylinders());
    }

    @Override
    public String accelerate() {
        return ("the accelerate for " + getCarName() + " is applied");
    }

    @Override
    public String  brake() {
        return ("The brake for " + getCarName() + " is applied");
    }
}

public class Main {
    public static void main(String[] args) {
        ///Car car = new Car(4,4, Innova);
        Innova innova = new Innova();
        innova.getCarName();
        System.out.println(innova.startEngine());
        System.out.println(innova.accelerate());
        innova.accelerate();

    }

    public static Car randomCarSelection() {
        int randomNumber = (int) ((Math.random() *5) + 1);
        System.out.println("Random number was generated at " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Innova();
            case 2:
                return new Safari();
            case 3:
                return new xuv();
            default:
                return null;
        }
    }
}

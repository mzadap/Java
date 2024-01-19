package interview.strings.days100.polymorphism.methodoverriding;

public class Bike extends Vehicle {

     void run() {
        System.out.println(" it is overriding method");
    }

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.run();
    }
}

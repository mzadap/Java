package interview.strings.days100.polymorphism.Runtime;

public class Splendor extends Bike{

    void run() {
        System.out.println("bike is running ");
    }

    public static void main(String[] args) {
        Bike bike = new Splendor();
        bike.run();
    }
}

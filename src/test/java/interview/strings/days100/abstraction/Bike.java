package interview.strings.days100.abstraction;

abstract class Bike {
    abstract void run();
    void display() {
        System.out.println("Hello this method is located in abstract class");
    }

    abstract void run(int a);
}

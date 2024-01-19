package interview.strings.days100.abstraction;

public class Honda extends Bike{
    @Override
    void run() {
        System.out.println("this is override as it is abstract method");
    }

    @Override
    void run(int a) {
        System.out.println("hi");
    }


    public static void main(String[] args) {
        Bike obj = new Honda();
        obj.run();

    }
}

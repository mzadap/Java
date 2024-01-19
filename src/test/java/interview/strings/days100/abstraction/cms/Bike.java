package interview.strings.days100.abstraction.cms;

abstract class Bike {
    //this class contains data member, abstract method, , method body(non-abstract method),
    // constructor and even main method
    Bike() {
        System.out.println("bike is created");
    }

    abstract void run();
    void color() {
        System.out.println("bike can contains colors");
    }
}

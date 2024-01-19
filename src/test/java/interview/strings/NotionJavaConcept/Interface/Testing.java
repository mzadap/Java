package interview.strings.NotionJavaConcept.Interface;

interface Testing {

    static void maunalTesting() {
        System.out.println("THis is manual testing");
    }

    abstract void automationTesting();

    //default method
    default void msg() {
        System.out.println("Hello testing default methods");
    }

    //static method
    static void display() {
        System.out.println("Static method");
    }
}

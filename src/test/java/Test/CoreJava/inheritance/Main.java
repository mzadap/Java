package Test.CoreJava.inheritance;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal(1,22,1,21, "Test");
        Dog dog = new Dog(1,12,"New",23,2,1,4,"New Coat");
        //dog.eat();
        dog.run();
        dog.walk();
    }
}

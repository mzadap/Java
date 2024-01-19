package interview.strings.days100.multple;

public class Computer {

    /*
     * 100 Days challenge, Day 05
     * Date - 05/09/2023
     * 46. How to create Multiple class in java Program
     * */

    public Computer() {
        System.out.println("Hello this is construtor");
    }

    void computer_method() {
        System.out.println("Dell laptops");
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.computer_method();

        Laptop laptop = new Laptop();
        laptop.laptop_method();
    }



}

class Laptop {

    public Laptop() {
        System.out.println("This is laptop construtor");
    }

    void laptop_method() {
        System.out.println("Hello this is laptop driver");
    }

}

package interview.strings.days100;

public class StaticAndInstanceMethodWorkingInJava {

    /*
     * 100 Days challenge, Day 05
     * Date - 05/09/2023
     * 45. Difference between Static and Instance method working in java Program
     * */

    public static void main(String[] args) {
        display();
        StaticAndInstanceMethodWorkingInJava java = new StaticAndInstanceMethodWorkingInJava();
        java.withoutDisplayed();

    }

    static void display() {
        System.out.println("Hello this static method");
    }

    public void withoutDisplayed() {
        System.out.println("This is non static method");
    }
}

package interview.strings.days100.codingbat.stringss;

public class HelloName {
    /*
        Day 02 Date - 23-12-2023
        * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
        helloName("Bob") → "Hello Bob!"
        helloName("Alice") → "Hello Alice!"
        helloName("X") → "Hello X!"
        * */
    public static void main(String[] args) {
        System.out.println(helloName("nachiket"));
        System.out.println(helloName("Pooja"));

    }

    public static String helloName(String name) {
        return "hello " + name + "!";
    }
}

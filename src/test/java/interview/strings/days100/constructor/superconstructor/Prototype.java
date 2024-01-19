package interview.strings.days100.constructor.superconstructor;

public class Prototype extends Demo {

     Prototype(String s1, String s2) {
         //this();
        super(1, 2);

        System.out.println("Dervied class parameterized constructor called " + s1 + s2);
    }

     Prototype() {
        //this("Hello", "world");
        System.out.println("Dervied class default constructor");
    }
}

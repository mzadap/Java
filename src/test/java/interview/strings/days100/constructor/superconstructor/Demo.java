package interview.strings.days100.constructor.superconstructor;

public class Demo {

    Demo(int x, int y) {
        //this();
        System.out.println("base class parameterized construtor " + x + y);
    }

    Demo() {
        //this(30, 40);
        System.out.println("base class default constructor");
    }

}

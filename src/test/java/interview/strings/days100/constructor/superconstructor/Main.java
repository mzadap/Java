package interview.strings.days100.constructor.superconstructor;

public class Main extends Tsting{

    public static void main(String[] args) {
        Prototype prototype = new Prototype("nachiket", "pooja");
        Tsting tsting = new Tsting();

    }
}

class Tsting{
    public static void main(String[] args) {
        System.out.println("Hello from testing class");
        //Prototype prototype = new Prototype();
        main("surendra", 2500000);
    }

    public static void main(String args, int test) {
        System.out.println("Hello new main with int parameter " + args + " "+ test);
    }

    public static void main(String args) {
        System.out.println("Hello this main method without string args");
    }
    Tsting() {
        System.out.println("THis is new class in same class");
    }
}

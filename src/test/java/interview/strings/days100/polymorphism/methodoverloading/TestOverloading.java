package interview.strings.days100.polymorphism.methodoverloading;

public class TestOverloading {

    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.add(1, 2));
        System.out.println(adder.add(1, 3, 3));
    }
}

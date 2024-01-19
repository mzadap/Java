package interview.strings.days100.polymorphism.methodoverloading;

public class Adder {

    final int add(int a, int b) {
        return a+b;
    }

    final int add(int a, int b, int c) {
        return a+b+c;
    }

}

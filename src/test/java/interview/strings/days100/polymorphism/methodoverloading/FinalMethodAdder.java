package interview.strings.days100.polymorphism.methodoverloading;

public class FinalMethodAdder {

    final int add(int a, int b) {
        return a+b;
    }

    final int add(int a, int b, int c) {
        return a+b+c;
    }

    static int adds(int a, int b) {
        return a+b;
    }

    static int adds(int a, int b, int c) {
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(adds(1,3));
    }

}

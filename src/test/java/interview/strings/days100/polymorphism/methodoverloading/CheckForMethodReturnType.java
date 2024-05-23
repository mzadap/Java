package interview.strings.days100.polymorphism.methodoverloading;

public class CheckForMethodReturnType {

    public static void main(String[] args) {
        System.out.println(sum(111, 222));
        System.out.println(sum(111, 222));
    }

    static int sum(int a, int b) {
        return a+b;
    }

    /*static double sum(int a, int b) {
        return a+b;
    }*/
}

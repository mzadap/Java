package interview.strings.NotionJavaConcept.Polymorphism.methodoverloading;

public class MODT {
    public static void main(String[] args) {
        System.out.println(add(122,122,122));
    }

    public static int add(int a, int b) {
        return a+b;
    }

    public static double add(double a, double b, double c) {
        return a+b+c;
    }
}

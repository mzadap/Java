package interview.strings.days100.inheritance.interview;

public class MainM {

    public static void main(String[] args) {
       B  b = new B();
        System.out.println(b.i);
        A a = new A();
        System.out.println(a.i);
        A a1 = new B();
        System.out.println(a1.i);
    }
}

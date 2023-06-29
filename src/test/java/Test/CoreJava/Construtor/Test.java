package Test.CoreJava.Construtor;

public class Test {

    public Test() {

        System.out.println("First constructor");
    }

    public Test(int x) {
        this();
        System.out.println("the value of x " + x);
    }

    public Test(int x, int y) {
        this(5);
        System.out.println("The va;lue of x " + x + " and value y " + y);
        System.out.println(x*y);
    }

    public static void main(String[] args) {
        //
        //new Test(6,10);
        new Test();
    }
}

package interview.strings.days100.inheritance.interviews;

public class TestB extends TestA{

    public TestB() {
        System.out.println("Hello this constructor b");
    }

    //@Override
    public void display() {
        System.out.println("Hello this is b method");
    }

    public void display1() {
        System.out.println("a+b");
    }

}

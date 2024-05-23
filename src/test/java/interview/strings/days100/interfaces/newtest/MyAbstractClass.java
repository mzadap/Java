package interview.strings.days100.interfaces.newtest;

abstract class MyAbstractClass extends BaseClass implements MyInterface1, MyInterface2{
    public abstract void method1();
    public abstract void method2();
    void commomMethod() {
        System.out.println("Common method in the abstract class");
    }
}

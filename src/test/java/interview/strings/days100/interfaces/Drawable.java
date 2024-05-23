package interview.strings.days100.interfaces;

abstract interface Drawable {
    abstract void draw();
    void colors();
    //From java 8 -> we can have static method with method body
    static String shape() {
        System.out.println("this method belongs to interface");
        return "hello world";
    }
    //From java 8 -> we can have default method with method body
    default void msg() {
        System.out.println("This is default method");
    }
    //From java 9 -> we can use private method with method body
    private void color() {
        System.out.println("this is private method");
    }
    int a = 10;
    void test();
}

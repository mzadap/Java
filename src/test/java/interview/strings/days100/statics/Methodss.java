package interview.strings.days100.statics;

public class Methodss {

    static String name = "nachiket";
    int a = 10;
    static void change() {
        name = "pooja";
        //a = 144;
        Methodss methodss = new Methodss();
        methodss.display();
    }

    static void change(String n) {
        System.out.println("Testing " + n);
    }
    void display() {
        System.out.println("hello this " + name);
    }
}

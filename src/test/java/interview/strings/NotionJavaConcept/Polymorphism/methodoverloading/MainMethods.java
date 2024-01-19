package interview.strings.NotionJavaConcept.Polymorphism.methodoverloading;

import java.util.List;

public class MainMethods {

    /*
    * can we overload java main() method
    * */

    public static void main(String args) {
        System.out.println("main with string[]");
    }

    public static void main(String[] args) {
        System.out.println("main with string");
    }

    public static void mains() {
        System.out.println("Main without args");
    }
}

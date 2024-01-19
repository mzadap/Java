package interview.strings.days100.multple;

public class ConstrutorOverloading {

    /*
     * 100 Days challenge, Day 06
     * Date - 06/09/2023
     * 48. How to create constructor overloading in java Program
     * */

    String s;
    public ConstrutorOverloading() {
        System.out.println("Hello construtor method called");
    }

    ConstrutorOverloading(String name) {
        this.s = name;
        System.out.println(name);
    }


    public static void main(String[] args) {
        ConstrutorOverloading construtors = new ConstrutorOverloading();
        ConstrutorOverloading construtors1 = new ConstrutorOverloading("Nachiket");

    }
}

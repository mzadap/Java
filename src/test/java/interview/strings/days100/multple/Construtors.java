package interview.strings.days100.multple;

public class Construtors {

    /*
     * 100 Days challenge, Day 05
     * Date - 05/09/2023
     * 47. How to create constructor in java Program
     * */

    int a;
    public Construtors() {

        System.out.println("this is new construtor");
    }
    Construtors(int a) {
        this.a = a;
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        Construtors construtors = new Construtors();
        Construtors construtors1 = new Construtors(12);

    }
}

package interview.strings.days100;

public class Methods {

    /*
     * 100 Days challenge, Day 04
     * Date - 04/09/2023
     * 42. How to create method in java Program
     * */

    public static void main(String[] args) {
        int sum = addSum(10, 20);
        System.out.println(sum);
        Methods methods = new Methods();
        methods.print();
    }

    public static int addSum(int a, int b) {
        return a+b;
    }

    public void print() {
        System.out.println("Hello this new method");
    }
}

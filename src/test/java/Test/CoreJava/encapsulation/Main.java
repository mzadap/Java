package Test.CoreJava.encapsulation;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(1, true);
        int pp = printer.printPage(4);
        System.out.println("Pages to bbe printer " + pp + " new  pages " + printer.getNoofPage());

    }
}

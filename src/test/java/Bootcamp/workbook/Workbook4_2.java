package Bootcamp.workbook;

public class Workbook4_2 {

    public static void main(String[] args) {

        tipTheWaiter(53.50);

    }

    public static void tipTheWaiter(double bill) {
        System.out.println("I hope you enjoy your meal");
        double tip = bill * 0.15;
        System.out.println("Your service was wonderfull! please accept this tip " + tip);
    }
}

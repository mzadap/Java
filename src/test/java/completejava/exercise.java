package completejava;

public class exercise {
    public static void main(String[] args) {
        int a, b, c, d;
        a = 10;
        b = 12;
        c = 20;
        d = 5;
        if ((a+b) < (c+d)) {
            System.out.println("a + b " + (a + b) + " is greater than c+d " + (c+d));
        }

        int angle1, angle2, angle3;
        angle1 = 100;
        angle2 = 40;
        angle3 = 40;
        if ((angle1 + angle2 + angle3) == 180) {
            System.out.println("yes it can form triangle with angle " + (angle1 + angle2 + angle3));
        }

        int num = 10;
        if (num % 2 == 0) {
            System.out.println("even");
        }
    }
}

package codechef;

public class EqualDistribution {

    public static void main(String[] args) {
        int a = 1;
        int b = 4;
        int sum= a + b;
        int x = sum - a;
        int y = sum - b;
        if (x==b && y==a) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        /*if (a==b) {
            System.out.println("yes");
        } else if (x == b) {
            System.out.println("Yes");
        } else if ((a-b) == b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }*/
    }
}

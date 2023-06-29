package codechef;

public class ChefWaterBottles {

    public static void main(String[] args) {
        int N = 3;
        int X = 1;
        int K = 4;
        int sum = K / X;
        if (sum > N) {
            System.out.println(N);
        } else {
            System.out.println(sum);
        }
    }
}

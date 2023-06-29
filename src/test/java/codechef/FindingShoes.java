package codechef;

public class FindingShoes {

    public static void main(String[] args) {
        int N = 2;
        int M = 4;

        if (M>=N) {
            System.out.println(N);
        } else {
            System.out.println(N + (N-M));
        }

    }
}

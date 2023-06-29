package codechef;

public class PassOrFail {

    public static void main(String[] args) {
        int N = 5;
        int X = 0;
        int P = 0;
        int correct = 3 * X;
        int wrong = N - X;
        int finalScore = correct - wrong;

        if (finalScore >= P) {
            System.out.println("pass");
        } else {
            System.out.println("Failed");
        }
    }
}

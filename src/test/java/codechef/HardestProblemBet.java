package codechef;

public class HardestProblemBet {

    public static void main(String[] args) {
        int A = 18;
        int B = 8;
        int C = 10;

       if (C < A && C < B) {
           System.out.println("Alice");
       } else if (B < A && B < C) {
           System.out.println("Bob");
       } else {
           System.out.println("Draw");
       }
    }
}

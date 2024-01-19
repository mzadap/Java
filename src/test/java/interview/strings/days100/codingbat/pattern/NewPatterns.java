package interview.strings.days100.codingbat.pattern;

public class NewPatterns {

    public static void main(String[] args) {
        pattern6(5);
        System.out.println();
        pattern1(5);
        System.out.println();
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
    }

    static void pattern1(int n) {
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int i = n; i>=0; i--) {
            for (int j = 1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int i = 1; i<=2*n; i++) {

            for (int j = 1; j<=n; j++) {
                if (j<=i && j<=9-i) {
                    System.out.print("* ");
                }  else {
                    System.out.print("");
                }
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        int k = 0;
        for (int i = 0; i<n; i++) {
            k =1;

            for (int j = 0; j<=i; j++) {
                if (j>=6-i && j<=4+i) {
                    System.out.print("* ");
                    k=0;
                } else {
                    System.out.print(" ");
                    k=1;
                }

            }
            System.out.println();
        }
    }
}

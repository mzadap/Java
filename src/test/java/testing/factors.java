package testing;

public class factors {

    public static void main(String[] args) {
        printFactors(45);
        printFactors(-1);
    }

    public static void printFactors(int a) {

        if (a < 1) {
            System.out.println("Invalid Value");
        }
        for (int i = 1; i<=a; i++) {
           int b = a % i;
           if ( a % i==0){
               System.out.println(i);
           }

        }
    }
}

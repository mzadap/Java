package interview.strings.days100.codingbat.pattern;

public class Mahinedra {

    public static void main(String[] args) {

        int num = 5;

        for (int i = 0;i<num ;i++ ) {

            for(int j = 0; j<=i; j++) {
                System.out.print("*");
            }
            for(int j = i*2; j<num*2-2; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j<=i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

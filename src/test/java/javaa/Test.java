package javaa;

public class Test {

    public static void main(String[] args) {

        int grade = 45;

        if (grade >= 80) {
            System.out.println("You got A grade");
        } else if (grade >= 70) {
            System.out.println("You got B grade");
        } else if (grade >= 60) {
            System.out.println("You got C grade");
        } else if (grade >= 50) {
            System.out.println("You got D grade");
        } else {
            System.out.println("Better luck next time");
        }
    }
}

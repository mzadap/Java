package interview.strings.days100;

public class GradeProgram {

    public static void main(String[] args) {
        int score = 35, passingScore = 40;

        if (score >= passingScore) {
            if (80 <= score) {
                System.out.println("A");
            } else if (score > 70) {
                System.out.println("B");
            } else if (score > 60) {
                System.out.println("C");
            } else if (score > 50) {
                System.out.println("D");
            } else {
                System.out.println("oops F ");
            }
        } else {
            System.out.println("Oops failed ");
        }
    }
}

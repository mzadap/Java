package interview.strings.days100.codingbat;

public class In1020 {

    public boolean in1020(int a, int b) {
        if (a > 10 && b > 10) {
            return  true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        In1020 in1020 = new In1020();
        System.out.println(in1020.in1020(11, 122));

        System.out.println(in1020.in1020(1, 122));
    }
}

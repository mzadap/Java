package interview.strings.days100.codingbat;

public class icyHot {

    public boolean icyHot(int temp1, int temp2) {
        if (temp1 < 0 || temp2 < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        icyHot icyHot = new icyHot();
        System.out.println(icyHot.icyHot(10, 20));
        System.out.println(icyHot.icyHot(-10, 20));
    }
}

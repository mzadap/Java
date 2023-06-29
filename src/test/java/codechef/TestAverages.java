package codechef;

public class TestAverages {

    public static void main(String[] args) {
        int a = 23;
        int b = 100;
        int c = 50;

        if (a > 0 && b > 0 && c >0) {
            int fi = (a + b) / 2;
            int li = (b + c) / 2;
            if (fi >= 35 && li >= 35) {
                System.out.println("pass");
            } else {
                System.out.println("fail");
            }
        }  else {
            System.out.println("fail");
        }

    }
}

package Test.CoreJava.Logic;

public class Logics {

    public int greatest(int a, int b, int c, int d) {
        if (a > b && a > c && a > d) {
            return a;
        }else if (b > a && b > c && b > d) {
            return b;
        }else if (c > a && c > b && c > d) {
            return c;
        }else if (d > a && d > b && d > c) {
            return d;
        }else return -1;
    }

    public static void main(String[] args) {
        Logics logics = new Logics();
        System.out.println(logics.greatest(2,3,1,4));
    }
}

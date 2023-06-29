package testing;

public class teenNumberChecker {

    public static boolean isTeen(int range){

        return (range >= 13 && range <= 19);
    }
    public static boolean hasTeen(int a, int b, int c){

        return  (isTeen(a) || isTeen(b) || isTeen(c));

    }
}

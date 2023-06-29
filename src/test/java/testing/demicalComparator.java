package testing;

public class demicalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstParameter, double secondParameter){

        return  (int) (firstParameter * 1000) == (secondParameter * 1000);

    }
}

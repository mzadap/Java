package testing;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12,30));
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }
        while (first != second) {
            if (first > second)
                first = first - second;
            else {
                second = second - first;
            }
        }
        return second;
    }
}

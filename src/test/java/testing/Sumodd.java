package testing;

public class Sumodd {

    public static void main(String[] args) {
        System.out.println(isOdd(2));
        System.out.println(sumOdd(10,20));
        System.out.println(sumOdd(13,13));
        System.out.println(sumOdd(100,1000));
    }
    public static boolean isOdd(int number){

        if (number < 0 ) {
            return false;
        }
        if (number % 2 != 0) {
            return true;
        }else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {

        int sum = 0;
        if (end >= start && start > 0){
            for ( int i = start ; i <= end ; i++){
                if (isOdd(i)){
                    sum+=i;
                }
            }
        }else {
            return -1;
        }
        return sum;
    }
}

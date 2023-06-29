package testing;

public class FlourPack {

    public static void main(String[] args) {
        System.out.println(canPack(1,5,10));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(1,0,4));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        int a = bigCount * 5;
        int sum = a + smallCount;
        if (goal == sum ) {
            return true;
        }else {
            return false;
        }
    }
}

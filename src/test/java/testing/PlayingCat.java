package testing;

public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(false,30));
        System.out.println(isCatPlaying(true,30));
        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(true,50));
        System.out.println(isCatPlaying(false,-10));

    }
    public static boolean isCatPlaying(boolean summer, int temperature){
        if (summer){
            return temperature >= 25 && temperature <= 45;

        }else{
            return temperature >= 25 && temperature <= 35;
        }
    }
}

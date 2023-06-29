package testing;

public class secondMinutes {

    public static String getDurationString(int minutes, int seconds){

        if ((minutes < 0) || (seconds < 0) || (seconds > 59)){
            return  "Invalid value";
        }
        int hours = minutes / 60;
        int remaining = minutes % 60;
        return hours + "h" +remaining + "m" +seconds+ "s";

    }

    public static String getDurationString(int seconds){

        if (seconds < 0 ){
            return  "Invalid value";
        }
        int minutes = seconds / 60;
        int remainingseconds = seconds % 60;
        return getDurationString(minutes,remainingseconds);
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(70,20));
        System.out.println(getDurationString(45));
    }
}

package Bootcamp.workbook;

public class workbook3_4 {

    public static void main(String[] args) {
        int temp = 5;
        String forecast = "";

        if ( temp <= -15 || temp <= -1) {
            forecast = "FREEZING";
            System.out.println("the forecast is " + forecast + " ! stay home!");
        } else if (temp >=0 && temp <= 10 ) {
            forecast = "Chilly";
            System.out.println("the forecast is " + forecast + " ! stay home!");
        } else {
            forecast = "warm";
            System.out.println("its " + forecast + " Go outside");
        }
    }
}

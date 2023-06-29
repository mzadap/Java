package Bootcamp.workbook;

public class Workbook4_3 {

    public static void main(String[] args) {

        printTemperatures(77.0);
        printTemperatures(61.0);
        printTemperatures(55.0);
        double test = fahrenheitToCelsius(39.0);
        System.out.println("tEST " +test);

    }

    public static double fahrenheitToCelsius(double fahrenhit) {
        double celcius;
        celcius = (fahrenhit - 32) * 5/9;
        return celcius;
    }

    public static void printTemperatures(double fahrenhit) {
        System.out.println("F: " + fahrenhit);
        double cel = fahrenheitToCelsius(fahrenhit);
        System.out.println("C: " + cel);
    }
}

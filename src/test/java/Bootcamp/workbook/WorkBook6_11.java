package Bootcamp.workbook;

import java.util.Arrays;

public class WorkBook6_11 {
    public static void main(String[] args) {
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheit = celciusToFahrenheit(celsius);
        //System.out.println(Arrays.toString(fahrenheit));
        printTemperature(celsius, "celsius");
        printTemperature(fahrenheit, "fahrenheit");


    }

    public static double[] celciusToFahrenheit(double[] celcius) {
        double[] fahrenheit = Arrays.copyOf(celcius, celcius.length);
        for (int i = 0; i< fahrenheit.length; i++) {
            fahrenheit[i] = (celcius[i]/5 * 9) + 32;
        }
        return fahrenheit;
    }

    public static void printTemperature(double[] temp, String type) {
        System.out.print(type);
        for (int i = 0; i < temp.length; i++) {
            System.out.print(String.format("%.2f ",  temp[i]) + " ");
        }
        System.out.println(" ");
    }
}

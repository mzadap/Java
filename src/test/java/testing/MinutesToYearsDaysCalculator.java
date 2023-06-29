package testing;

public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes){

        if (minutes <0){
            System.out.println("Invalid Valid");
        }
        else {
            long years = minutes / (60 * 24 * 365);
            long remainingminutes = minutes % ((60 * 24) * 365);
            long days = remainingminutes / (60 * 24);

            System.out.println(minutes + "min = " + years + "y " + days + " d");
        }
    }

    public static void main(String[] args) {
        printYearsAndDays(10000000);
    }
}

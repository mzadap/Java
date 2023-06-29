package testing;

public class PrintWeek {

    public static void main(String[] args) {

        for (int i = 0 ; i<=6 ; i++){
            printDayOfTheWeek(i);
            printDaysOfTheWeek(i);
        }
    }

    public static void printDayOfTheWeek(int day){

        switch (day){

            case 0:
                System.out.println("Sunday was found");
                break;

            case 1:
                System.out.println("Monday was found");
                break;

            case 2:
                System.out.println("Tuseday was found");
                break;

            case 3:
                System.out.println("Wednesday was found");
                break;

            case 4:
                System.out.println("Thursday was found");
                break;

            case 5:
                System.out.println("Friday was found");
                break;

            case 6:
                System.out.println("Saturday was found");
                break;

            default:
                System.out.println("Invalid day");
                break;
        }
    }

    public static void printDaysOfTheWeek(int day){

        if (day == 0){
            System.out.println("Sunday was found");
        }else if (day == 1){
            System.out.println("Monday was found");
        }else if (day == 2){
            System.out.println("Tuesday was found");
        }else if (day == 3){
            System.out.println("Wednesday was found");
        }else if (day == 4){
            System.out.println("Thursday was found");
        }else if (day == 5){
            System.out.println("Friday was found");
        }else if (day == 6){
            System.out.println("Saturday was found");
        }else {
            System.out.println("Invalid values ");
        }
    }
}

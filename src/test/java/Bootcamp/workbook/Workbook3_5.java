package Bootcamp.workbook;

public class Workbook3_5 {

    public static void main(String[] args) {

        int day = 7;
        boolean holiday = false;

        if (holiday) {
            System.out.println("Wooh, no work");
        } else if ((day == 6) || (day == 7)) {
            System.out.println("its weekend, no work");
        } else {
            System.out.println("wake up at 7:00 :(");
        }
    }
}

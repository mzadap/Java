package Bootcamp.workbook;

public class WorkBook6_1 {

    public static void main(String[] args) {
        String[] seats = {"Harry", "Neville", "Ron", "Hermione", "Seamus"};
        System.out.println("It's time to take your fifth year exams. Please, take your seats\n");
        System.out.println(seats.length);
        for (int i=0; i<seats.length; i++) {
            System.out.println(seats[i] + ", You will take seats " + i);
        }
       /* System.out.println(seats[0] + ", you");
        System.out.println(seats[1]);
        System.out.println(seats[2]);
        System.out.println(seats[3]);
        System.out.println(seats[4]);*/
    }
}

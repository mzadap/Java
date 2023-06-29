package Bootcamp.workbook;

public class WorkBook6_2 {

    public static void main(String[] args) {
        String[] students = {"Malfoy", "Crabbe", "Goyle", "Pansy", "Dean"};
        System.out.println("It's time to take your fifth year exams. Please, take your seats\n");
        for (int i = 0; i<students.length; i++) {
            System.out.println(students[i] + " You will take seat " + i);
        }
    }
}

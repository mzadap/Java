package Bootcamp.workbook;

public class WorkBook6_3 {

    public static void main(String[] args) {
        String[] aisles = {"apples", "Banans", "Candy", "Chocolate","coffee", "tea"};
        System.out.println("Do you sell coffee?");
        for (int i = 0; i< aisles.length; i++) {

            if (aisles[i].equals("abc")) {
                System.out.println("\n we have that in aisle " + i);
                break;
            }

        }
    }
}

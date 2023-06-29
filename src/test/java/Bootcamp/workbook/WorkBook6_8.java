package Bootcamp.workbook;

public class WorkBook6_8 {
    public static void main(String[] args) {

        String apples[] = {"Gala" , "Granny Smith", "Macintosh"};
        double priceApples[] = {1.99, 1.49,  1.29};
        System.out.println("\n Here is the receipt ");
        for (int i = 0; i<apples.length; i++) {
            System.out.println("\t" + apples[i] + " " + priceApples[i]);
        }
    }
}

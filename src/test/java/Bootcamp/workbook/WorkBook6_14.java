package Bootcamp.workbook;

public class WorkBook6_14 {

    public static void main(String[] args) {
        int[][] randomNumber = new int[100][10];
        for (int i = 0; i< randomNumber.length; i++) {
            for (int j = 0; j< randomNumber[i].length; j++) {
                randomNumber[i][j] = randomNumber();
            }
        }
        print2DArray(randomNumber);
    }

    public static int randomNumber() {
        return (int) (Math.random() * 101);
    }

    public static void print2DArray(int[][] random) {
        for (int i = 0; i<random.length; i++) {
            //System.out.print(random[i]);
            for (int j = 0; j< random[i].length; j++) {
                System.out.print(random[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}

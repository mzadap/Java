package Bootcamp.workbook;

public class WorkBook6_5 {
    public static void main(String[] args) {
        int[] randomNumber = {randonNumber(), randonNumber(), randonNumber(), randonNumber(), randonNumber(), randonNumber(), randonNumber(), randonNumber(), randonNumber(), randonNumber()};
        int highScore = 0;
        int score = 0;
        System.out.print("Here are the scores: ");
        for (int i = 0; i<randomNumber.length; i++) {
            System.out.print( randomNumber[i] + "\t");
        }

        for (int i = 0; i< randomNumber.length; i++) {
            if (randomNumber[i] > highScore) {
                highScore = randomNumber[i];
                score = i;

            }
        }
        System.out.println("\nThe highest score is :" + highScore + " give that man a cookie");
        System.out.println("\n It's the gentleman in seat: " + score + " .Give that man a cookie!");

    }

    public static int randonNumber() {
        double random = Math.random() * 50000;
        return (int) random;
    }
}

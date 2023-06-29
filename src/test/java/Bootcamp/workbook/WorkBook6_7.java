package Bootcamp.workbook;

public class WorkBook6_7 {
    public static void main(String[] args) {

        int wins = 0;
        int lose = 0;
        String javaBox[] = {"Win", "Win", "Win", "Win", "Lose", "Lose", "Win"};
        for(int i = 0; i< javaBox.length; i++) {
            if (javaBox[i].equals("Win")) {
                wins++;
            } else {
                lose++;
            }
        }
        System.out.println("With a professional record of " + wins + "wins and " + lose + "losses.");
        System.out.println("He is the pride of oracle: Java Fury!");
    }

    public static int javaBoxing() {
        return (int)(Math.random() * 100);
    }
}

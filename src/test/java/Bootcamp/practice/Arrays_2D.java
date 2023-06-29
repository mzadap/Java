package Bootcamp.practice;

import java.util.Arrays;

public class Arrays_2D {
    public static void main(String[] args) {
        int[][] table = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                System.out.print(table[i][i]);
            }
        }


      /*  String[][] test = new String[3][2];
        System.out.println(test.length);
        System.out.println(test[0].length);
        System.out.println(test[1].length);*/
        //new int[3][4];
       /* test[0][0] = 10;
        test[0][1] = 20;
        test[0][2] = 30;
        test[0][3] = 40;

        test[1][0] = 2;
        test[1][1] = 4;
        test[1][2] = 8;
        test[1][3] = 10;

        test[2][0] = 3;
        test[2][1] = 6;
        test[2][2] = 9;
        test[2][3] = 12;*/

       /* System.out.println("Nachiket: " + test[0][0] + " " + test[0][1] + " " + test[0][2] + " " + test[0][3]);
        System.out.println("Shubham: " + test[1][0] + " " + test[1][1] + " " + test[1][2] + " " + test[1][3]);
        System.out.println("Stephan: " + test[2][0] + " " + test[2][1] + " " + test[2][2] + " " + test[2][3]);*/
    }
}

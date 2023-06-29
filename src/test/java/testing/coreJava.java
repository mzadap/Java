package testing;

import java.util.Scanner;

public class coreJava {

    private static Object String;

    public static void main(String[] args) {

        /*int myfirst = (5 + 1) + (10 * 2);
        int mysecond = 12;
        int mythird = myfirst * 6;
        int mytotal = myfirst + mysecond + mythird;
        int mylast = 1000 - mytotal;

        System.out.println(mylast);
        System.out.println(mytotal);*/
        int maxx = 10000;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        System.out.println(max);
        System.out.println(min);
        //int no = 21474836411;
        /*byte mymax = Byte.MAX_VALUE;
        byte mymin = Byte.MIN_VALUE;
        System.out.println(mymax);
        System.out.println(mymin);*/

        short mymax1 = Short.MAX_VALUE;
        short mymin1 = Short.MIN_VALUE;
        System.out.println(mymax1);
        System.out.println(mymin1);

        long mymax11 = Long.MAX_VALUE;
        long mymin11 = Long.MIN_VALUE;
        System.out.println(mymax11);
        System.out.println(mymin11);

       // byte myb = (byte) (mymin / 2);

        byte chal = 127;
        short chal1 = 32767;
        int chal2 = 50000;
        long lo = 50000L + 10 * (chal + chal1 + chal2);
        System.out.println(lo);

        float minfloat = Float.MIN_VALUE;
        float maxfloat = Float.MAX_VALUE;
        System.out.println("min float " + minfloat);
        System.out.println("max float " + maxfloat);

        double minfloat1 = Double.MIN_VALUE;
        double maxfloat1 = Double.MAX_VALUE;
        System.out.println("min double " + minfloat1);
        System.out.println("max double " + maxfloat1);

        int value = 5 / 3;
        float ch = 5f / 3f;
        double ch1 = 5d / 3d;
        int total = (int) (3 * (value + ch) / ch1);

        System.out.println(value);
        System.out.println(ch);
        System.out.println(ch1);
        System.out.println(total);

        int pound = 50;
        double result = pound * 0.45359237d;
        System.out.println(result);

        char myCHar = 'D';
        System.out.println(myCHar);
        String myString = "THis is my String ";
        System.out.println("My String is equal to" + myString);
        myString = myString + ", one more string added";
        System.out.println(myString);
        int myInt = 50;
        String addString = "15" + myInt;
        System.out.println(addString);
        int resultTest = 12 - 14;
        System.out.println(resultTest);

        int result1 = 1 + 2;
        System.out.println("Result for 1 + 2 = " + result1);
        int previousresult = result1;
        System.out.println("previous result is " + previousresult);
        result1 = result1 - 1;
        System.out.println("Result for 3 - 1 = " + result1);

        result1 = result1 * 10;
        System.out.println("2 * 10 = " + result1);

        result1 = result1 / 5;
        System.out.println("20 / 10 = " + result1);

        result1 = result1 % 3;
        System.out.println("4 % 3 = " + result1);

        result1++;
        System.out.println("1 + 1 = " + result1);

        result1--;
        System.out.println("2 - 1 = " + result1);

        result1 += 2;
        System.out.println("1 + 2 = " + result1);

        result1 *= 10;
        System.out.println("3 * 10 = " + result1);

        result1 /= 3;
        System.out.println("30 / 3 = " + result1);

        result1 -= 1;
        System.out.println("10 - 1 = + " + result1);

        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("it is not alien");
        int topscore = 80;
        if (topscore <= 100 )
            System.out.println("You got topscore");

        int secondTopScore = 50;
        if ((topscore > secondTopScore) && (topscore < 100)){
            System.out.println("Second top score is less than Top score and top score is less than");
        }

        if ((topscore > 80) || (secondTopScore <= 80)){
            System.out.println("one of the condition is true");
        }

        int newValue = 50;
       /* if (newValue = 50){
            System.out.println("error");
        }*/
        boolean compareValue = (newValue==50) ? true : false;
        System.out.println(compareValue);

        double firstDouble = 20.00d;
        double secondDouble = 80.00d;
        double resultDouble = firstDouble + secondDouble;
        System.out.println(" Result of first double and second double " + resultDouble);
        resultDouble *= 100.00d;
        System.out.println("Result after multiple by 10 = " + resultDouble);
        double remainder  = resultDouble % 40.00d;
        System.out.println("remainder " + remainder);
        boolean stepBasedResult = (remainder==0) ? true : false;

        System.out.println("step based result " + stepBasedResult);

        if (stepBasedResult == true){
            System.out.println("Remainder is not zeros");
        }else {
            System.out.println("Got some remainder");

        }
        calculator(800, 5, 100, true);
        calculator(10000, 8, 200, false);

        int score = calculateHighScorePosition(1000);
        displayHighScorePosition("Nachiket", score);

        score = calculateHighScorePosition(500);
        displayHighScorePosition("Nachiket", score);

        score = calculateHighScorePosition(100);
        displayHighScorePosition("Nachiket", score);

        score = calculateHighScorePosition(50);
        displayHighScorePosition("Nachiket", score);

    }
    public static void displayHighScorePosition(String playerName, int position){
        System.out.println( playerName + "Managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score){
        int position = 4;
        if (score >= 1000){
            position = 1;
        }else if (score >= 500){
            position = 2;
        }else if (score >= 100){
            position = 3;
        }
        return position;
    }


    public static int calculator(int score , int levelCompleted, int bonus, boolean gameover){
        if (gameover){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("your final score is " + finalScore);
            return finalScore;
        }else
            return -1;
    }


}


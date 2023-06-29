package codechef;

import Test.CoreJava.inheritance.multipleinheritance.Parent1;

import java.util.Scanner;

public class ScoreConsistent {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A =  sc.nextInt();
        int B =  sc.nextInt();
        int C =  sc.nextInt();
        int D =  sc.nextInt();
        int team1  = C - A;
        int team2 = D - B;


        if (A <= C && B <= D) {
            System.out.println("Possible");
        } else {
            System.out.println("Not Possible");
        }


    }
}

package Bootcamp.project;

import java.util.Scanner;

public class Challenge1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's play Rock Paper Scissors\n When i say 'Shoot ', chosse:rock,paper, or scissors.");
        scanner.nextLine();
        System.out.println("Are you ready? write 'Yes' if you are");
        String ans = scanner.nextLine();
        if (ans.equals("yes")) {
            System.out.println("Great");
            System.out.println("rock -- paper -- scissors, shoot");
            String yourChosse = scanner.nextLine();
            String computerChoice = computerChoice();
            System.out.println("you choose: " + yourChosse);
            System.out.println("Computer chose " + computerChoice);
            String resuls = result(yourChosse, computerChoice);
            System.out.println(resuls);
        } else {
            System.out.println("Darn, some other time!!");
        }

        scanner.close();
    }

    public static String computerChoice() {
        double random = Math.random() * 3;
        int choice1 = (int) random;
        switch (choice1) {
            case 0: return "rock";
            case 1: return "paper";
            case 2: return "scissors";
            default: return "";
        }
    }

    public static String result(String yourChoice, String computerChoice) {
        if ((yourChoice.equals("rock") && computerChoice.equals("scissors")) || (yourChoice.equals("paper") && computerChoice.equals("rock"))
        || (yourChoice.equals("scissors") && computerChoice.equals("paper"))) {
            return  "you win!!" ;
        } else if ((computerChoice.equals("rock") && yourChoice.equals("scissors")) || (computerChoice.equals("paper") && yourChoice.equals("rock")) || (computerChoice.equals("scissors") && yourChoice.equals("paper"))) {
           return  "You lose" ;
        } else if ((yourChoice.equals("paper") && computerChoice.equals("paper")) || (yourChoice.equals("rock") && computerChoice.equals("rock")) || (yourChoice.equals("scissors") && computerChoice.equals("scissors"))){
            return  "It is a Tie";
        } else {
            return "ERROR";
        }
    }
}

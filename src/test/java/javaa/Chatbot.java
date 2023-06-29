package javaa;

import java.util.Scanner;

public class Chatbot {

    public static void main(String[] args) {

        String name, location, pl;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nHello. What is your name");
        name = sc.nextLine();
        System.out.println("\nHi " + name + " ! I'm Jarvis. Where are from ");
        location = sc.nextLine();
        System.out.println("Oh wow i hear its beatiful place " + location + " I'm from AI ");
        System.out.println("\nhow old are you!!");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("So you are " + age + " , cool! I'm 400 years old ");
        System.out.println("This means I'm " + (400/age) + " times older than you");
        System.out.println("\nEnough about me. Whats ur favorite language? (Don't say python)");
        pl = sc.nextLine();
        System.out.println("\n" + pl + " , that's great! Nice chatting with you " + name + " I have to logged off now. See ya!!");
        sc.close();
    }
}

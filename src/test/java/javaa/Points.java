package javaa;

public class Points {
    public static void main(String[] args) {

        int points = 0;

        points -= 50;
        System.out.println("Harry was caught wandering. " + points+ "points for gryffindor");
        points -= 3;
        System.out.println("Harry was being cheeky in class. " + points + "points for gryffindor");
        points += 30;
        System.out.println("Hermione got full marks on Lockhart's quiz. " + points + "points for gryffindor");
        points += 100;
        System.out.println("Ron won the underground chess game. " + points + " points for gryffindor");
        points += 60;
        System.out.println("Harry defected quirrell " + points + " points for gryffindor");
        System.out.println(points);

    }
}

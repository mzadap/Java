package javaa;

public class Comparsion {

    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1);
        System.out.println(b2);

        int marks1 = 60;
        int marks2 = 70;
        System.out.println("Is mark1 greater than mark2 " + false);
        System.out.println("Is mark1 less than mark2 " + (marks1 < marks2));
        System.out.println("Is marks1 greater than mark2 " + (marks1 >= marks2));
        System.out.println("Is mark1 less than mark2 " + (marks1 <= marks2));
        System.out.println("Is mark1 equals to mark2 " + (marks1 == marks2));
        System.out.println("Is mark1 not equals to mark2 " + (marks1 != marks2));
        String s1 = "Testing";
        String s2 = "Testing";

        System.out.println("Is s1 equal to s2 " + (s1.equals(s2)));
        System.out.println("Is s1 not equal to s2 " + (!s1.equals(s2)));
    }
}

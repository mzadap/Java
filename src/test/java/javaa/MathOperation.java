package javaa;

public class MathOperation {

    public static void main(String[] args) {

        long milkyWay = 30000000000L;
        long andromeda = 100000000000L;

        double marks = 35.5;
        double bounsMarks = 10.5;

        int sweetOne1 = 10;
        int sweetTwo2 = 15;

        System.out.println(milkyWay + andromeda);
        System.out.println(marks + bounsMarks);
        System.out.println(sweetOne1 + sweetTwo2);

        System.out.println("there are " + (milkyWay + andromeda) + " stars in the milky way and andromeda galaxies");
        System.out.println("with the bonus marks, ron scored " + (marks + bounsMarks/10) + " on his potions test. snape was't too thrilled");
        System.out.println("Fred has " + (sweetOne1 + sweetTwo2) + " more sweets than george");
        System.out.println("andromda galaxy has " + andromeda + " more stars than the milky way");
        System.out.println("Snape ended up removing marks. Ron actually scored " +  marks + " on his potions test");
        System.out.println("Fred and George used a special spell to multiply their sweets to " + (sweetOne1 * sweetTwo2));
        System.out.println("Snape made an error on his excel, accidentally multiplying Ron's score to " + (marks * 10));
        System.out.println("Originally, fred had "  );
    }
}

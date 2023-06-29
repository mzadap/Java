package codechef;
/*

this program is used to calculate if chef is able to finish season 1 before exam time or not.
 */

public class ThePreparations {

    public static void main(String[] args) {

        int m = 10;
        int episodes  = 1;
        int durationOfEpisodes = 5;

        if (m > (episodes * durationOfEpisodes)) {
            System.out.println("Yes");
        } else {
            System.out.println("no");
        }
    }
}

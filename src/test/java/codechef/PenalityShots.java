package codechef;

import java.util.Scanner;

/*

penality shots there are two team, team 1 and team 2
where team 1 is odd and team 2 is even
check if team 1 wins or team 2 wins
 */
public class PenalityShots {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int team1Count = 0;
        int team2Count = 0;
        for (int i = 0; i < t; i++) {
            int no = sc.nextInt();
            int[] teams = new int[no];
            for (int j = 0; j < teams.length; j++) {
                teams[j] = sc.nextInt();
            }

            team1Count = teams[0] + teams[2] + teams[4] + teams[6] + teams[8];
            team2Count = teams[1] + teams[3] + teams[5] + teams[7] + teams[9];
            if (team1Count > team2Count) {
                System.out.println("1");
            } else if (team2Count > team1Count) {
                System.out.println("2");
            } else {
                System.out.println("draw");
            }

        }
    }
}

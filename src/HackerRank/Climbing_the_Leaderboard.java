package HackerRank;

import java.util.*;

/**
 *
 * @author Elías Acevedo
 */
public class Climbing_the_Leaderboard {

    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] posicion = new int[alice.length];
        int posicionAux = 1;
        for (int i = 0; i < alice.length; i++) {
            for (int j = 0; j < scores.length - 1; j++) {
                if (scores[j] <= alice[i]) {
                    break;
                }
                if (scores[j] > scores[j + 1]) {
                    posicionAux++;
                }
            }
            if (scores[scores.length - 1] > alice[i]) {
                posicionAux++;
            }
            posicion[i] = posicionAux;
            posicionAux = 1;
        }
        return posicion;
    }



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] scores = {100, 90, 90, 80, 75, 60};

        int[] alice = {50, 65, 77, 90, 102};

        int[] result = climbingLeaderboard(scores, alice);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

}

package HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 *
 * @author Elías Acevedo
 */
public class Forming_a_Magic_Square {

    static int formingMagicSquare(int[][] s) {
        int[][][] posibles = {{{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
        {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
        {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
        {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
        {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
        {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
        {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
        {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}}};
        int result = 0;
        int cambios = 0;
        int cambiosMim = 100;
        int cubo = -1;
        for (int i = 0; i < posibles.length; i++) {
            cubo = i;
            for (int n = 0; n < s.length; n++) {
                for (int m = 0; m < s[0].length; m++) {
                    if (s[n][m] == posibles[cubo][n][m]) {
                        continue;
                    } else {
                        cambios += Math.abs(s[n][m] - posibles[cubo][n][m]);
                    }
                }
            }
            if (cambios < cambiosMim) {
                cambiosMim = cambios;
            }
            cambios = 0;
        }

        return result = cambiosMim;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[][] s = {{4, 4, 7}, {3, 1, 5}, {1, 7, 9}};

        int result = formingMagicSquare(s);

        System.out.println(result);
    }
}

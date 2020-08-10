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
public class Halloween_Sale {

    static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
        int juegos = 0;
        while (s >= p) {
            juegos++;
            s -= p;
            p = Math.max(p-d, m);
        }
        return juegos;
    }

    public static void main(String[] args) {

        int p = 73;

        int d = 72;

        int m = 44;

        int s = 9163;

        int answer = howManyGames(p, d, m, s);

        System.out.println(answer);
    }
}

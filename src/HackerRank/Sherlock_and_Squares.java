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
public class Sherlock_and_Squares {

    static int squares(long a, long b) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(b); i++) {
            int x = i * i;
            if ((x >= a) && (x <= b)) {
                count++;
            }
        }
        return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int a = 181510012;

        int b = 293922871;

        int result = squares(a, b);

        System.out.println(result);
    }
}

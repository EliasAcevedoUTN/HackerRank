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
public class Repeated_String {

    static long repeatedString(String s, long n) {
        char[] chrIn = s.toCharArray();
        int i = 0;
        long max = 0;
        long quo = n / chrIn.length;
        long rem = n % chrIn.length;
        while (i < chrIn.length) {
            if (chrIn[i] == 'a') {
                max++;
            }
            i++;
        }
        i = 0;
        max = max * quo;
        while (i < rem) {
            if (chrIn[i] == 'a') {
                max++;
            }
            i++;

        }
        return max;

    }

    public static void main(String[] args) throws IOException {

        String s = "aba";

        long n = 10;

        long result = repeatedString(s, n);

        System.out.println(result);
    }

}

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
public class Chocolate_Feast {
    static int chocolateFeast(int n, int c, int m) {
        int choco = n/c;
        int resto = n/c;
        do {
            int restoN = 0;
            int chocoN = 0;
            if (resto >= m){
                restoN = restoN + (resto%m);
                chocoN = resto/m;
                choco+= chocoN;
                resto = restoN + chocoN;
            } else {
                break;
            }
        } while (true);
        return choco;
    }

    public static void main(String[] args) throws IOException {

            int n = 7;

            int c = 3;

            int m = 2;

            int result = chocolateFeast(n, c, m);

            System.out.println(result);
    }
}
